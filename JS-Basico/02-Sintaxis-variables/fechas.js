// Listas
const lista1 = [1, 'Hola', true, undefined, null];
const lista2 = new Array(2, 'hola', true, undefined, null);
const lista3 = new Array(3);

lista3[0] = 'elemento en index 0';

// Objetos
const movil = {
    altura: 5,
    ancho: 3,
    marca: 'Xiaomi',
    isWhite: false,
    contactos: ['Gorka', 'Martín', 'Raúl'],
    tarjeta: {
        marca: 'Sandisk',
        almacenamiento: 12,
    },
};

movil.anyo = 2019;
movil.marca = 'Samsung';

// Fechas
// Librerías de apoyo Moment.js
const ahora = new Date();
console.log(ahora);

const fecha_milis = new Date(10);
console.log(fecha_milis);

const fecha_cadena = new Date('march 24 2022');
console.log(fecha_cadena);

const fecha_valores = new Date(2022, 0, 21);
console.log(fecha_valores);

const dia = ahora.getDate();
const mes = ahora.getMonth() + 1;
const anyo = ahora.getFullYear();

console.log(dia, mes, anyo);