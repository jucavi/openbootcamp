// Fuciones tipo flecha
const array = [1, 4, 5, 2, 7, 3, 8];
const array2 = array.map(function (valor) {
    return valor * 2;
});

console.log(array2);

const dobleValor = array.map((val) => val * 2);
console.log(dobleValor);

const duplica = (val) => val * 2;
const array3 = array.map(duplica);
console.log(array3);
