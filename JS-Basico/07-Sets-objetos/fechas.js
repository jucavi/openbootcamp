const fecha = new Date();

console.log(fecha);

// ATENCIÓN!! los meses inicializan en 0;
const fecha2 = new Date(1987, 10, 20, 23, 45, 54, 194);
console.log(fecha2)

// Con milisegundos
const fecha3 = new Date(0);
console.log(fecha3);

const fecha4 = new Date(100000000000);
console.log(fecha4);

const fecha5 = new Date(-100000000000);
console.log(fecha5);

// Con cadena de caracteres
const fecha6 = new Date('October 12, 1999 12:15:15');
console.log(fecha6);

// Para comparar fechas convertir a milisegundos
console.log(fecha.getTime() === fecha6.getTime());
console.log(fecha.getTime() > fecha6.getTime());
console.log(fecha.getTime() < fecha6.getTime());
console.log(fecha.getTime() !== fecha6.getTime());

// dia, mes, año de una fecha
console.log(fecha.getDate());
console.log(fecha.getMonth() + 1);
console.log(fecha.getFullYear());
console.log(fecha.getTimezoneOffset());

// MOSTRAR
// Página MDN more info
console.log(fecha.toLocaleDateString('es'));