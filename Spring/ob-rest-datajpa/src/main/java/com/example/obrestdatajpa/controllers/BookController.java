package com.example.obrestdatajpa.controllers;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private BookRepository bookRepository;
    private final Logger log = LoggerFactory.getLogger(BookController.class);

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Devuelve todos los libros
     * https://localhost:8080/api/books
     * @return ArrayList de libros
     */
    @GetMapping("/api/books")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    /**
     * Devuelve un libro localizado por su id
     * https://localhost:8080/api/books/id
     * @param id identificador unico de la base de datos
     * @return ResponseEntity
     */
    @GetMapping("/api/books/{id}")
    @ApiOperation("Buscar un libro por clave primaria id Long")
    public ResponseEntity<Book> findOneById(@ApiParam("Clave primaria tipo Long") @PathVariable Long id) {
        Optional<Book> bookOPt =  bookRepository.findById(id);

        // Opción 1
        if (bookOPt.isPresent()) {
            return ResponseEntity.ok(bookOPt.get());
        }
        return ResponseEntity.notFound().build();

        // Opción 2
        // return bookOPt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Crea un libro
     * https://localhost:8080/api/books
     * @param book Libro a guardar
     * @return ResponseEntity
     */
    @PostMapping("/api/books")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));

        if (book.getId() != null) { // Ese libro ya existe
            log.warn("trying to create an existing book with id " + book.getId());

            return ResponseEntity.badRequest().build();
        }

        Book res = bookRepository.save(book);
        return ResponseEntity.ok(res);
    }

    /**
     * Actualizar un libro existente
     * https://localhost:8080/api/books
     * @param book Libro modificado
     * @return ResponseEntity
     */
    @PutMapping("/api/books")
    public ResponseEntity<Book> update(@RequestBody Book book) {
        if (book.getId() == null) { // El libro no existe con lo cual no puede ser modificado
            log.warn("trying to update a non existent book");

            return ResponseEntity.badRequest().build();
        }

        if (!bookRepository.existsById(book.getId())) {
            log.warn("trying to update a non existent book id" + book.getId());

            return ResponseEntity.notFound().build();
        }

        Book res = bookRepository.save(book);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/api/books/{id}")
    @ApiIgnore
    public ResponseEntity<Book> delete(@PathVariable Long id) {
        try {
            bookRepository.deleteById(id);
        } catch (IllegalArgumentException e) {
            log.warn("trying to delete a non existent book");

            return ResponseEntity.badRequest().build();
        } catch (EmptyResultDataAccessException e) {
            log.warn("trying to delete a non existent book");

            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
