class Estudiante {
    constructor(nombre, asignaturas = ['JavaScript', 'HTML', 'CSS']) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    obtenDatos() {
        return {
            nombre: this.nombre,
            asignaturas: this.asignaturas
        };
    }
}

const estudiante = new Estudiante('Juan Carlos');
console.log(estudiante.obtenDatos());

const nuevo_estudiante = new Estudiante('Felix', ['Óptica', 'Análisis Mátematico I', 'Física Cuantica']);
console.log(nuevo_estudiante.obtenDatos());