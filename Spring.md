# Spring

## Java Enterprice Edition - JakartaEE
## Spring framework
- Core de Spring, es a lo que nos referimos cuando se habla de [Spring](https://spring.io/projects/spring-framework)
- [Spring Framework](https://spring.io/projects/spring-framework#learn) es la base de todo el ecosistema de tecnologias de Spring
-  Su objetivo es facilitar el desarrollo java en el entorno empresarial

## Creacion desde IntelliJ
- Nuevo projecto Maven (Tectonologia utilizada para construir proyectos, ejecutar tests, cargar dependencias)
- Añadimos Spring al proyecto
	- Editamos el fichero pom.xml
		- Añadimos etiqueta <dependencies></dependencies>
		- [MVNrepository](https://mvnrepository.com/)
		- Añadimos Spring Context
	- Load maven changes

- Crear archivo beans.xml en src.main.resources
	- Un bean es un objeto java normal gestionados por Spring
	- Spring arranca un contenedor de beans para poder inyectarlos donde se necesite
	- El contenido de ese contenedor explicado en [documentacion](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#spring-core)

## Beans
	- Son objetos java
	- Tabaja con scopes Singleton o Prototype (default singleton) y se modifica en la cabecera del bean scope="prototype"
		singleton: Se crea un objeto y se reutiliza para toda la aplicación
		prototype: Se crea un objeto cada vez


## Agregar Beans de forma automatica [documentacion](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-annotation-config)
	- See @Component, @Value ...
