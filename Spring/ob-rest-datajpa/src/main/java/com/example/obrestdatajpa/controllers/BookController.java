package com.example.obrestdatajpa.controllers;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * https://localhost:8080/api/books
     * @return
     */
    @GetMapping("/api/books")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    /**
     * https://localhost:8080/api/books/id
     * @param id
     * @return
     */
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id) {
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
     * https://localhost:8080/api/books
     * @param book
     * @return
     */
    @PostMapping("/api/books")
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));
       return bookRepository.save(book);
    }
}
