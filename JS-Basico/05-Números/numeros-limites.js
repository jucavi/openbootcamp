// Operador .valueOf()
// obatiene valores númericos a partir de literales
let a = 2;
let b = new Number(3);

console.log(a);
console.log(b);
console.log(a + b);
console.log(a.valueOf() + b.valueOf());

// NaN - Infinity
let n = Number('adios');
console.log(isNaN(n));
console.log(n);

let numerador = 19;
let divisor = 0;

// Infinity
console.log(numerador / divisor)

// Como convertir los string a valores numéricos con Number, parseInt y parseFloat
let numero1 = '5.6';
let numero2 = 17.2;

console.log(numero1 + numero2); // ERROR de concepto
console.log(Number(numero1) + numero2);
console.log(parseInt(numero1) + numero2);
console.log(parseFloat(numero1) + numero2);

// Números hexadecimales (base16)
let numHex = '0x3a5b7';
console.log(parseInt(numHex))
console.log(parseInt(numHex, 16)) // Base16
console.log(parseInt(numHex, 8)) // Base 8

// Obtener los valores máximo y mínimo en JavaScript
let maxValorJS = Number.MAX_VALUE;
let minValorJS = Number.MIN_VALUE;
let minPresition = Number.EPSILON;

console.log(maxValorJS)
console.log(minValorJS);
console.log(minPresition)