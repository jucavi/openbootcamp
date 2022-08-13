const obj = {
  nombre: 'Juan',
  apellido: 'González',
  idDeveloper: true,
  librosFavoritos: ['El método', 'El código', 'El código de la manifestación'],
  '4-juegos': [1, 2, 3, 5]
};

console.log(obj.nombre);
console.log(obj['4-juegos']);

const property = 'apellido'
console.log(obj[property]);

const obj2 = obj
console.log(obj2);

obj2.nombre = 'Iñigo';
console.log(obj2.nombre);
console.log(obj.nombre);

// Como realizar la copia de un objeto
const objCopy = { ...obj };

// Como ordenar listas de objetos en función de una propiedad
const pelis = [
    {
        titulo: 'Pulp Fiction',
        director: 'Quentin Tarantino',
        fecha: new Date(1994, 5, 21),
    },
    {
        titulo: 'Los Vengadores',
        director: 'Joss Whedon',
        fecha: new Date(2012, 4, 11),
    },
    {
        titulo: 'Asesinos Natos',
        director: 'Oliver Stone',
        fecha: new Date(1994, 8, 26),
    },
    {
        titulo: 'El Padrino',
        director: 'Francis Ford Coppola',
        fecha: new Date(1972, 6, 15),
    },
];

pelis.sort(
    (a, b) =>
        a.director.toLocaleUpperCase().charCodeAt() -
        b.director.toLocaleUpperCase().charCodeAt()
);

console.log(pelis)



