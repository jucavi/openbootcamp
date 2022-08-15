// Formas de importar/exportar módulos
// 1. CommonJS - require
// 2. ES6 - import

// CommonJS
// const moduleMatematicas = require('./modulos/matematicas')
// const multiplica = moduleMatematicas.multiplica
const { factorial, suma } = require('./modulos/matematicas')

// console.log(moduleMatematicas)
// console.log(module)


// const fact = moduleMatematicas.factorial(5);
const fact = factorial(5)
console.log(fact);


// const sum = moduleMatematicas.suma(34, 7);
const sum = suma(44, 55)
console.log(sum);
