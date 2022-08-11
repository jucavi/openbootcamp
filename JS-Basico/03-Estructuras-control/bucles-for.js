for (let i = 0; i < 10; i++) {
  console.log(i);
}

let lista = [1, 2, 3, 4, 5, 6, 7];
for (let i = 0; i < lista.length - 1; i++) {
    console.log(i);
}

// Estructura for .. of
for (let i of lista) {
  console.log(i);
}

// Estructura forEach
lista.forEach(valor => {
  console.log(valor);
});

// Estructura for .. in
let persona = {
  nombre: 'Juan Carlos',
  apellido: 'Vilarrubia',
  edad: 44,
  isDeveloper: true
};

for (let attr in persona) {
  console.log(attr);
}