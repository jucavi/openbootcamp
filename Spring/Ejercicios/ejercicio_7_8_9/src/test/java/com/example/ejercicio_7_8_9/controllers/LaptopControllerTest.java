package com.example.ejercicio_7_8_9.controllers;

import com.example.ejercicio_7_8_9.entities.Laptop;
import com.example.ejercicio_7_8_9.repositories.LaptopRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.method.HandlerTypePredicate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {

    private TestRestTemplate testRestTemplate;
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @LocalServerPort
    private int port;
    @Autowired
    private LaptopRepository repository;

    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);

        Laptop laptop1 = new Laptop(null, "Asus", "Zenbook Pro", 14, "Intel Evo", 16);
        Laptop laptop2 = new Laptop(null, "Lenovo", "ThinkPad X1 Carbon Gen 9", 14, "Intel Core i5", 32);
        Laptop laptop3 = new Laptop(null, "Acer", "Spin 3", 14, "Intel Core i7", 16);

        repository.save(laptop1);
        repository.save(laptop2);
        repository.save(laptop3);
    }

    @AfterEach
    void tearDown() {
        repository.deleteAll();
    }

    @Test
    void findAll() {
        ResponseEntity<Laptop[]> response = testRestTemplate.getForEntity("/api/laptops", Laptop[].class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCodeValue());

        assertTrue(response.hasBody());
        List<Laptop> laptops = Arrays.asList(Objects.requireNonNull(response.getBody()));
        assertEquals(3, laptops.size());
    }

    @Test
    void findOneById() {
        ResponseEntity<Laptop> response = testRestTemplate.getForEntity("/api/laptops/2", Laptop.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCodeValue());

        assertTrue(response.hasBody());
        Laptop laptop = response.getBody();
        assertNotNull(laptop);
        assertNotNull(laptop.getId());
        assertEquals(2, laptop.getId());
    }

    @Test
    void create() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        String json = """
                {
                    "manufacturer": "Lenovo Test",
                    "model": "ThinkBook",
                    "screenSize": 15,
                    "processor": "Intel Core i7",
                    "ram": 16
                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json, headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCodeValue());

        Laptop laptop = response.getBody();
        assertNotNull(laptop);

        assertEquals(4, repository.count());
        assertEquals("Lenovo Test", laptop.getManufacturer());
    }

    @Test
    void update() {
        Long totalEntities = repository.count();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        String json = """
                {
                    "id": 2,
                    "manufacturer": "Manufacturer Updated",
                    "model": "Model Updated",
                    "screenSize": 15,
                    "processor": "Processor Updated",
                    "ram": 8
                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json, headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.PUT, request, Laptop.class);

        assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());
        assertEquals(202, response.getStatusCodeValue());

        Laptop laptop = response.getBody();
        assertNotNull(laptop);

        assertEquals(totalEntities, repository.count());
        assertEquals("Manufacturer Updated", laptop.getManufacturer());
    }

    @Test
    void delete() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> request = new HttpEntity<>(headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops/1", HttpMethod.DELETE, request, Laptop.class);


        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCodeValue());

        assertFalse(repository.existsById(1L));
    }

    @Test
    void deleteAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> request = new HttpEntity<>(headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.DELETE, request, Laptop.class);


        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCodeValue());

        assertEquals(0, repository.count());
    }
}