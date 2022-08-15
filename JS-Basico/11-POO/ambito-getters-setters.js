class Persona {
    // Private -> #
    // Solo se puede acceder desde dentro de la clase no es accesible desde las clases hijas
    #nombre;
    #edad;

    // Protected -> _
    // El prefijo _ no aplica a nivel de lenguaje, pero es una convención bien conocida entre programadores
    // que no se debe acceder a tales propiedades y métodos desde el exterior
    // Accesible desde la clase y sus clases descendientes
    _isDeveloper = true;

    constructor(nombre, edad, sexo) {
        this.#nombre = nombre;
        this.#edad = edad;
        this._sexo = sexo;
    }

    saludo() {
        console.log(
            `Hola mi nombre es ${this.nombre}, tengo ${this.#obtenEdad()} años`
        );
    }

    // Getter
    obtenNombre() {
        return this.#nombre;
    }

    setEdad(edad) {
        this.#edad = edad;
    }

    getEdad() {
        return this.#edad;
    }

    // No es una función getter porque no es accesible desde fuera de la clase
    #obtenEdad() {
        return this.#edad;
    }
}

const persona = new Persona('Elena', 43, 'F');
console.log(persona);
persona.saludo();

console.log(persona.nombre);
console.log(persona.obtenNombre());
console.log(persona._sexo);
persona._sexo = 'M'
console.log(persona._sexo);
console.log(persona._isDeveloper);

// Getters: métodos que nos permiten obtener acceso a métodos/atributos privados y protegidos
// Setters: métodos que nos permiten modificar el valor de los atributos privados y protegidos
persona.setEdad(56);
console.log(persona.getEdad());

