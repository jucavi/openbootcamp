// Funciones asincronas

function miAsinc() {
    // Hace una llamada a una base de datos externa
    // Puede darnos algún error
}

const miPromesa = new Promise((resolve, reject) => {
    const i = Math.floor(Math.random() * 2);
    if (i !== 0) {
        resolve();
    } else {
        reject();
    }
});

miPromesa
    .then(() => console.log('Se ha ejecutado de forma correcta'))
    .catch(() => console.log('Ha ocurrido un error'))
    .finally(() => console.log('Este bloque se ejecuta siempre'));
