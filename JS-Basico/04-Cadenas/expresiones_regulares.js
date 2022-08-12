// https://regexr.com
let texto_largo = 'Tito no es un mono cualquiera. A Tito no le gusta trepar por los árboles y odia comer plátanos. Él prefiere pasear por bosque, oler las flores y recoger las nueces que se caen de los árboles';

console.log(texto_largo.match(/los/g));
console.log(texto_largo.match(/no/g));
console.log(texto_largo.match(/par/g));

// Existe la palabra dentro del texto?
console.log(texto_largo.includes('prefiere'));
console.log(texto_largo.includes('terremoto'));

// Saber si un texto empieza con una palabra
console.log(texto_largo.startsWith('Tito'));

// Saber si un texto termina con una palabra
console.log(texto_largo.endsWith('Tito'));
