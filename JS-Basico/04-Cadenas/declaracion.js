let str_sng = 'Hola soy un texto con comillas simples';
let str_dbl = "Hola soy un texto con comillas dobles";

let str_comillas = "El otro día me dijo literalmente \"ve a sacar la basura\"";
let str_comillas_simples = 'El otro día me dijo literalmente "ve a sacar la basura"';
let str_comillas_dobles = "El otro día me dijo literalmente 've a sacar la basura'";
let str_comillas_simples_2 = 'El otro día me dijo literalmente \'ve a sacar la basura\'';

let str_backticks = `Hola esto es un texto con backticks`;

let nombre = 'Gorka';
let saludo = `Hola, ${nombre} bienvenido`;

let plantilla = `
<html>
    <h1>Página web de ${nombre}</h1>
    <p>Este es un párrafo</p>
</html>
`;

// Longitud de un string
let str = 'Hola soy un string';
console.log(str.length);

// Obtención de partes de cádenas de carácteres
let slice_str = str.slice(0, 10);
console.log(slice_str);

let substring_str = str.substring(5, 10);
console.log(substring_str);

// Reemplazar parte del contenido de una cadena de caracteres
let cadena = 'Hola mi nombre es Gorka';


cadena.replace('Gorka', 'Miguel');
console.log(cadena.replace('Gorka', 'Miguel'));
console.log(cadena); // repolace no es un método inplace

// Replace si se utilizan strings solo reemplaza la primera instancia
let texto_largo = 'Tito no es un mono cualquiera. A Tito no le gusta trepar por los árboles y odia comer plátanos. Él prefiere pasear por el bosque, oler las flores y recoger las nueces que se caen de los árboles.';
console.log(texto_largo.replace('los', 'cinco'));

// Al utilizar la expresión regular /g, reemplaza todas las instancias
console.log(texto_largo.replace(/los/g, 'cinco'));

