// Local Storage
localStorage.setItem('nombre', 'Juan');

const nombre = localStorage.getItem('nombre');
console.log(nombre);


// localStorage.setItem('persona', { nombre: 'Juan', edad: 44 });

// JSON.stringify Convierte un objeto/array en string
localStorage.setItem('persona', JSON.stringify({ nombre: 'Juan', edad: 44 }));

// JSON.parse Convierte un objeto/array convertido a traves de stringify en un obketo JS
console.log(JSON.parse(localStorage.getItem('persona')))

localStorage.removeItem('nombre')
localStorage.removeItem('persona')



// Session Storage
sessionStorage.setItem('nombre-session', 'Juan1')
sessionStorage.setItem('nombre', 'Juan')

sessionStorage.getItem(nombre)

console.log(sessionStorage)
for (key in sessionStorage) {
    if (Object.prototype.hasOwnProperty.call(sessionStorage, key)) {
        sessionStorage.removeItem(key)
    }
}


// Coockies
document.cookie = 'nombreCookie=juanCookie;expires=' + new Date(2023, 0, 1).toUTCString()

console.log(document.cookie)


