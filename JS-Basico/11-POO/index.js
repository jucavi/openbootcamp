const persona = {
    nombre: 'Juan Carlos',
    edad: 44,
    isDeveloper: true,
    saludo: function () {
        console.log('Hola');
    }
};

persona.saludo();

const otra_persona = {
    nombre: 'Miguel',
    edad: 12,
    isDeveloper: false,
    saludo: function () {
        console.log('Hola');
    },
};

otra_persona.saludo();

const creaPersona = (nombre, edad, isDeveloper) => {
    return {
        nombre,
        edad,
        isDeveloper,
        saludo: () => {
            console.log('Hola desde la factory function');
        }
    };
};

const nueva_persona = creaPersona('Juan', 34, true);
nueva_persona.saludo();

const nueva_persona_2 = creaPersona('Laura', 38, false);
nueva_persona_2.saludo();