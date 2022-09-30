package com.example.obrestdatajpa.service;

import org.junit.jupiter.api.Test;

import com.example.obrestdatajpa.entities.Book;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest {

    @Test
    void calculatePriceTest() {
        // Configuarción de la prueba
        Book book = new Book(1L, "El señor de los anillos", "J.R.R Tolkien", 1200, 50d, LocalDate.now(), true);
        BookPriceCalculator calculator = new BookPriceCalculator();

        // Ejecución del comportamiento a testar
        Double price = calculator.calculatePrice(book);

        // Comprobación de las aserciones
        assertTrue(price > 0);
        assertEquals(price, 57.99);
    }
}