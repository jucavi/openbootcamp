package com.example.ejercicio_7_8_9.controllers;

import com.example.ejercicio_7_8_9.entities.Laptop;
import com.example.ejercicio_7_8_9.repositories.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class LaptopController {

    LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        try {
            Optional<Laptop> laptopOpt = laptopRepository.findById(id);

            return ResponseEntity.ok(laptopOpt.get());
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }  catch (IllegalArgumentException  e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop) {
        if (laptop.getId() != null) {
            return ResponseEntity.badRequest().build();
        }

        Laptop laptopEntity = laptopRepository.save(laptop);
        return ResponseEntity.ok().body(laptopEntity);
    }

    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop) {
        if (laptop.getId() == null ) {
            return ResponseEntity.badRequest().build();
        }

        if (!laptopRepository.existsById(laptop.getId())) {
            return ResponseEntity.notFound().build();
        }

        Laptop laptopEntity = laptopRepository.save(laptop);
        return ResponseEntity.accepted().body(laptopEntity);
    }


    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id) {
        try {
            Optional<Laptop> laptopOpt = laptopRepository.findById(id);

            Laptop laptop = laptopOpt.get();
            laptopRepository.delete(laptop);
            return ResponseEntity.ok().build();

        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }  catch (IllegalArgumentException  e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> delete() {
        laptopRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
