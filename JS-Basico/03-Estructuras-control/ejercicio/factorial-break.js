// Cálculo del factorial de un número con bucle while
let numero = 10;
let factorial = 1;
let i = 2;

while (true) {
  if (i > numero) break;
  factorial *= i;
  i++;
}

console.log(factorial);
