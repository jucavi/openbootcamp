const array = ['hola', 2, 5, 90, false, undefined];

// Forma antigua y poco eficiente
for (let i = 0; i < array.length; i++) {
  console.log(array[i]);
}

// Forma ES6;
array.forEach(value => {
  console.log(value)
});

// Busqueda de un valor dentro de una lista
console.log(array.indexOf(5));

const variable = array.find(value => {
  if (value === 90) return true;
});

console.log(variable);

const listaObjetos = [
  { nombre: 'Leire', edad: 35 },
  { nombre: 'Gorka', edad: 34 },
  { nombre: 'Miguel', edad: 28 },
  { nombre: 'Amaia', edad: 12 },
];

const objeto = listaObjetos.find(obj => {
  return obj.nombre === 'Miguel';
});

console.log(objeto.edad);


const { edad } = listaObjetos.find(o => o.nombre === 'Amaia');
console.log(edad);
