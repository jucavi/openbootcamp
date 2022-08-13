const persona = {
  nombre: 'Juan Carlos',
  apellido: 'Vilarrubia',
  edad: 44,
  altura_cm: 175,
  eresDesarrollador: true
};

const edad = persona.edad;
console.log(edad);

const amigo1 = {
    nombre: 'Juan',
    apellido: 'Quiles',
    edad: 40,
    altura_cm: 180,
    eresDesarrollador: false
};

const amigo2 = {
    nombre: 'Raúl',
    apellido: 'Esposito',
    edad: 45,
    altura_cm: 175,
    eresDesarrollador: false
};


const amigos = [persona, amigo1, amigo2];
console.log(amigos)

amigos.sort((a, b) => b.edad - a.edad);
console.log(amigos)