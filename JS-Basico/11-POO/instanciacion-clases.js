class Persona {
    constructor(nombre, edad, isDeveloper) {
        this.nombre = nombre;
        this.edad = edad;
        this.isDeveloper = isDeveloper;
    }

    saludo() {
        console.log(`Hola mi nombre es ${this.nombre}, tengo ${this.edad} años`)
    }
}

const nueva_persona = new Persona('Juan', 44, true);
console.log(nueva_persona);
nueva_persona.saludo();

let numero = 60;
let persona_2 = new Persona('Maria', 32, false);
console.log(persona_2);

console.log(persona_2 instanceof Persona);