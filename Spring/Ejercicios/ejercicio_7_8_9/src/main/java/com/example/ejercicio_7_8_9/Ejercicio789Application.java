package com.example.ejercicio_7_8_9;

import com.example.ejercicio_7_8_9.entities.Laptop;
import com.example.ejercicio_7_8_9.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio789Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio789Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "Asus", "Zenbook Pro", 14, "Intel Evo", 16);
		Laptop laptop2 = new Laptop(null, "Lenovo", "ThinkPad X1 Carbon Gen 9", 14, "Intel Core i5", 32);
		Laptop laptop3 = new Laptop(null, "Acer", "Spin 3", 14, "Intel Core i7", 16);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
	}

}
