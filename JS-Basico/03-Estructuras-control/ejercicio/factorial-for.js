// Cálculo del factorial de un número con bucle for
let numero = 10;
let factorial = 1;

for (let i = 2; i <= numero; i++) {
  factorial *= i;
}

console.log(factorial);