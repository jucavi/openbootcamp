package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);

		// CRUD
		// CREAR
		Book book = new Book(null, "La Iliada", "Homero", 1000, 29.99, LocalDate.of(1456, 11,12), true);

		// ALMACENAR
		bookRepository.save(book);

		// RECUPERAR
		bookRepository.findAll();

		// BORRAR
		// bookRepository.deleteById(1L);
	}

}
