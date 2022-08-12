let array1 = new Array(1, 2, 3, 4, 5);
let array2 = [1, 2, 3, 4, 5];

console.log(array1)
console.log(array2)
console.log(typeof array1)
console.log(typeof array2);

let var1 = { id: false };
let array = [1, 'hola', false, { id: 5 }, null, undefined, var1];
console.log(array);

// Acceder a los valores de un array a través de su posición
// array[indice] => 0, 1...
console.log(array[0]);
console.log(array[1]);
console.log(array[2]);
console.log(array[3]);

// Métodos para introducir nuevos valores en nuestro array
// .push(), .unshift() métodos inplace... mutan el valor de nuestro array
array.push(45, 'nuevos valores');
console.log(array);

// .push inserta los valores al final del array
// .unshift inserta los valorea al principio del array
array.unshift(43, { id: 12 });
console.log(array);

const ary = [1, 3, 'hola'];
// Métodos para eliminar valores
// .pop() .shift() métodos inplace... mutan el valor del array
let ultimo_elemento = ary.pop();
console.log(ultimo_elemento);

console.log(ary);

let primer_elemento = ary.shift();
console.log(primer_elemento);

console.log(ary);

// Método para eliminar, modificar o añadir valores en nuestro array
const array3 = [1, 2, 3, 4, 5, 6];

// Eliminar valores .splice(indice, posiciones, valores)
// Elimina un valor a partir del indice pasado como primer parámetro
array3.splice(2, 1);
console.log(array3);

// Añadir valores
array3.splice(2, 0, 'hola', 'adios');
console.log(array3);

// Modificar valores
array3.splice(2, 2, 'me ves', 'ya no me ves');
console.log(array3)





