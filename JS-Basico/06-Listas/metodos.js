const lista1 = ['hola', 2, false, null];
const lista2 = ['adios', 9, true, undefined];

console.log(lista1.concat(lista2));
console.log(lista1);

const lista3 = lista1.concat(lista2);
console.log(lista3);

// Factor de propagación
const lista4 = [...lista1, ...lista2];
console.log(lista4);

// Obtener una lista a partir de otra
console.log(lista1.slice(0, 3));

const lista5 = lista2.slice(1, -2);
console.log(lista5)