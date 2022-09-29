
## Spring Boot

Proyecto de Spring Boot con las dependencias / starters [Spring Boot](https://start.spring.io/)
* Starters para persistencia
  * H2
  * Spring Data JPA
  
* Starters para web
  * Spring Web
  * Spring Boot Dev Tools

Aplicación API REST con acceso a base de datos H2 para persistir la información.

El acceso se puede realizar dede Postman o Navegador.

## Entidad Book
* Book
  * @Entity 

## Repository
* BookRepository
    * Interface extends Repository, JPARepository ...
    * @Repository

## Controller
* BookController
    * @RestController (RESTful), @Controller (mvc)
    * @GetMapping, @PostMapping, @DeleteMapping ...
        1. Buscar todos los libros
        2. Buscar un libro
        3. Crear un nuevo libro
        4. Actualizar un libro
        5. Borrar un libro
        6. Borrar todos los libros
    * @PathVariable Type var
    * @RequestBody, @RequestHeader HttpHeaders header

