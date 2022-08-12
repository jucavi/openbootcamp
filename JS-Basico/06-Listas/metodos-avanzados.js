const array = ['San Sebastián', 'Madrid', 'Barcelona', 'Alicante', 'Bilbao'];

array.forEach(val => {
  console.log(val);
});

const citiesUpper = array.map(val => val.toUpperCase());
console.log(citiesUpper);

const citiesPrefix = array.map((val, index) => `${index + 1} - ${val}`);
console.log(citiesPrefix);


const listaObjetos = [
    { nombre: 'Leire', edad: 35 },
    { nombre: 'Gorka', edad: 34 },
    { nombre: 'Miguel', edad: 28 },
    { nombre: 'Amaia', edad: 12 },
];

const nameFilter = listaObjetos.filter(val => val.nombre.startsWith('G'));
console.log(nameFilter);

const nameNewFilter = listaObjetos.filter((val) => val.nombre !== 'Gorka');
console.log(nameNewFilter);

// REDUCE
const reduce = listaObjetos.reduce((acc, cur, index, arrayOriginal) => {
  console.log(acc);
  console.log(cur);
  console.log(index);
  console.log(arrayOriginal);
}, 0);
const sumaEdad = listaObjetos.reduce((acc, cur) => acc + cur.edad, 0);
console.log(sumaEdad);