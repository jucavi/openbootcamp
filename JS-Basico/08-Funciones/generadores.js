function* generaId() {
  let id = 0;
  while (true) {
    id++;
    yield id;
    if (id === 10) {
      return;
    }
  }
}

const gen = generaId();
console.log(gen);

console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next());

