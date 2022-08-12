// Principales operaciones aritméticas
let a = 4.5;
let b = 4.8;

// Suma (+)
console.log(a + b);
// Resta (-)
console.log(a - b);
// Multiplicación
console.log(a * b);
// División
console.log(a / b);

// Representación de los números en cadenas de texto
console.log(typeof a);
let a_s = a.toString();

console.log(a_s);
console.log(typeof a_s);

// Redondeo de números decimales
let c = 3.3;
let d = c * 3;
let e = 1234.12346546631

console.log(d);
// .toFixed()
// convierte a string limitando el número de decimales al valor que le pasamos como parámetro;
console.log(d.toFixed());
console.log(d.toFixed(3));
console.log(typeof d.toFixed(3));

console.log(e.toFixed(3));


let f = 13.3452354;
// .toPresition
// convierte a string limitando el número de cifras significativas y redondea;
console.log(f.toPrecision(7))
