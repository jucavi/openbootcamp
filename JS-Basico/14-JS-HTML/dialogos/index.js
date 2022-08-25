const boton = document.getElementById('btn');

boton.addEventListener('click', () => {
    // alert('Se ha hecho click')
    // confirm('Estas de acuerdo?') && console.log('OK')
    // confirm('Estas de acuerdo?')
    //     ? alert('OK')
    //     : alert('Cancelado')

    const respuesta = confirm('Acepta las condiciones?')
    if (respuesta) {
        console.log('Estas de acuerdo')
    } else {
        console.log('No estas de acuerdo')
    }


});

const btnInfo = document.getElementById('info');

btnInfo.addEventListener('click', () => {
    const nombre = prompt('Cual es tu nombre?')

    nombre
        ? console.log(`Tu nombre es ${nombre}`)
        : console.log('Debes introducir un nombre');
});

const lista = [
    {
        nombre: 'Gorka',
        edad: 34
    },
    {
        nombre: 'Julen',
        edad:27
    },
    {
        nombre: 'Amaia',
        edad: 32
    }
];

console.table(lista)