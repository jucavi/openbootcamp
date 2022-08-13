const array = [1, 2, 3, 4, 5, 2, 4, 5, 6, 7, 2];

const mySet = new Set(array);
console.log(mySet);

mySet.delete(1);
console.log(mySet);

mySet.add(1);
console.log(mySet);

mySet.add({ id: 5 });
console.log(mySet);

mySet.add({ id: 5 });
console.log(mySet);

console.log(mySet.has(5));
console.log(mySet.has(9));

console.log(mySet.size);

mySet.forEach(valor => {
  console.log(valor)
});

// Iterador de mySet
const it_mySet = mySet.values();
console.log(it_mySet);
// retorna un objeto del tipo { value: val, done: true/false } done: true cuando no tiene mas valores que entregar
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());
console.log(it_mySet.next());

const arr_mySet = [...mySet];
console.log(arr_mySet);

