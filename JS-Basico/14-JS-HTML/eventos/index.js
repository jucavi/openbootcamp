const hTexto = document.getElementById('h-texto');

console.log(hTexto);

hTexto.addEventListener('cambioTexto', event => {
    console.log(event)
    event.target.innerText = event.detail.texto
    event.target.style.color = event.detail.color
});

function cambioTexto(nuevoTexto, color) {
    const evento = new CustomEvent('cambioTexto', {
        detail: {
            texto: nuevoTexto,
            color: color
        }
    });
    hTexto.dispatchEvent(evento)
}