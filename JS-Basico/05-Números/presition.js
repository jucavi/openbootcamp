// Declaración de variables numéricas (enteros y con decimales)
let a = 5;
console.log(typeof a);

let b = 0.012;
console.log(b);

// Precisión
let c = 0.0000000002;
console.log(c);


console.log(b + c);
console.log(b * c);

// Truco Profesor
console.log(Math.round((b + c) * 100) / 100);
console.log((b * 10 + c * 10) / 10);


// Truco Mio
function findCoef(num) {
  let ary_num = num.toString().split('.');
  if (ary_num.length > 1) return ary_num[1].length;
  if (ary_num[0].startsWith('2e')) return parseInt(ary_num[0].split('-')[1]);
  return 1;
}

let coef = Math.max(
    findCoef(b),
    findCoef(c)
);

console.log(coef);
console.log((b * coef + c * coef) / coef);