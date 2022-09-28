package com.example.ejercicio_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);
		UsuarioRepository repository = context.getBean(UsuarioRepository.class);

		Usuario user1 = new Usuario(null, "Jon", "jon@email.com");
		Usuario user2 = new Usuario(null, "Jane", "jane@email.com");

		System.out.println("Antes de hacer la inserción la base de datos cuenta con: " + repository.count() + " usuarios");

		repository.save(user1);
		repository.save(user2);

		System.out.println("Después de hacer la inserción la base de datos cuenta con: " + repository.count() + " usuarios");
		System.out.println("Los usuarios en base de datos son: " + repository.findAll());
	}

}
