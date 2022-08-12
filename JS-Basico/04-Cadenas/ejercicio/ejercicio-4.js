let nombre = 'Juan Carlos';
let apellido = 'Vilarrubia';
let estudiante = nombre.concat(' ', apellido);
let estudianteMayus = estudiante.toUpperCase();
let estudianteMinus = estudiante.toLowerCase();
let estudianteLen = estudiante.length;
let nombrePrimeraLetra = nombre.charAt(0);
let apellidoUltimaLetra = apellido.charAt(apellido.length - 1);
let estudianteSinEspacios = estudiante.trim().replace(/ /g, '');
let isNombreInEstudiante = estudiante.includes(nombre);


console.log(nombre);
console.log(apellido);
console.log(estudiante);
console.log(estudianteMayus);
console.log(estudianteMinus);
console.log(estudianteLen);
console.log(nombrePrimeraLetra);
console.log(apellidoUltimaLetra);
console.log(estudianteSinEspacios);
console.log(isNombreInEstudiante);
