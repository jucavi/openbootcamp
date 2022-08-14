function alwaysTrue() {
  return true;
}

const delayPromise = new Promise((resolve, reject) => {
  if (true) {
    resolve();
  } else {
    reject();
  }
});

delayPromise
  .then(setTimeout(() => console.log('Hola soy una promesa'), 5000))
  .catch(() => 'ERROR');


function* generatorParId() {
  let id = 0;
  while (true) {
    id++;
    yield id * 2;
  }
}

const gen = generatorParId();

console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);