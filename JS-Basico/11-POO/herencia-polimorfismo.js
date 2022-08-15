class Persona {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    saludo() {
        console.log(
            `Hola mi nombre es ${this.nombre}, tengo ${this.edad} años`
        );
    }
}

class Desarrollador extends Persona {
    constructor(nombre, edad, lenguajes) {
        super(nombre, edad);
        this.lenguajes = lenguajes;
    }

    saludo() {
        super.saludo();
        console.log(`Soy un desarrollador, con experiencia en ${this.lenguajes}`)
    }
}


// Herencia
const developer = new Desarrollador('Juan', 45, ['Ruby', 'Python']);
console.log(developer);

// Polimorfismo
developer.saludo();