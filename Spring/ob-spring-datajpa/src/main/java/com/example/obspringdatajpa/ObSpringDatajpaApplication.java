package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(ObSpringDatajpaApplication.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("find");
		System.out.println("El numero de coches en base de datos es: " + repository.count());

		// Crear y almacenar un coche en la vase de datos
		Coche toyota = new Coche(null, "Toyota", "Prius", 2010);
		repository.save(toyota);
		System.out.println("El numero de coches en base de datos es: " + repository.count());

		// Recuperar todos
		System.out.println("El numero de coches en base de datos es: " + repository.findAll());
	}

}
