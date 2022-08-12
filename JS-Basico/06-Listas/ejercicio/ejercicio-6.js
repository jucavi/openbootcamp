const listaCompra = [
  'Mantequilla',
  'Queso',
  'Zanahorias',
  'Peras',
  'Leche'
];

listaCompra.push('Aceite de Girasol');
console.log(listaCompra);

listaCompra.pop();
console.log(listaCompra);

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

const posteriorAnyo = (arr, year) => arr.filter(film => film.fecha.getFullYear() > year);
console.log(posteriorAnyo(pelis, 2010));

const directores = pelis.map(peli => peli.director);
console.log(directores);

const titulos = pelis.map(peli => peli.titulo);
console.log(titulos);

const mixConcat = directores.concat(titulos);
console.log(mixConcat);

const mixPropagation = [...directores, ...titulos];
console.log(mixPropagation);
