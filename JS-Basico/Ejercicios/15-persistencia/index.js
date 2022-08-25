const nombre = 'Juan Carlos';
const apellido = 'Vilarrubia';

const persona = {
    nombre: nombre,
    apellido: apellido
};

const person_string = JSON.stringify(persona);
sessionStorage.setItem('persona', person_string);
localStorage.setItem('persona', person_string);

const ahora = new Date()
const expires = new Date(ahora.getTime() + 2*60*1000)
document.cookie = `persona=${person_string};expires=${expires}`;

