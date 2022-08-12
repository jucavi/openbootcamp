// .sort() modifica el array
const arr = [2, 5, 7, 3, 1, 6, 8];

arr.sort((a, b) => a - b);

console.log(arr);


const listaObjetos = [
    { nombre: 'Leire', edad: 35 },
    { nombre: 'Gorka', edad: 34 },
    { nombre: 'Miguel', edad: 28 },
    { nombre: 'Amaia', edad: 12 },
];

// ORDENADO POR EDAD
listaObjetos.sort((a, b) => a.edad - b.edad);
console.log(listaObjetos);

// ORDENANDO POR NOMBRRE
listaObjetos.sort((a, b) => a.nombre.toLowerCase().charCodeAt(0) - b.nombre.toLowerCase().charCodeAt(0));
console.log(listaObjetos);


const res = arr.every(val => val > 0);
console.log(res);

// COMPARACION DE LISTAS
const arr1 = [1, 2, 3, 4];
const arr2 = [1, 2, 3, 4];

const comparaArrays = (arr1, arr2) => {
  if (arr1.length !== arr2.length) return false;
  return arr1.every((val, index) => val === arr2[index]);
};

const arr3 = [1, 2, 3, 6];
console.log(comparaArrays(arr1, arr2));
console.log(comparaArrays(arr1, arr3));
