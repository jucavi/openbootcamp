const parrafos = document.querySelectorAll('.seccion p');
const papelera = document.querySelector('#trash');


parrafos.forEach(parrafo => {
    parrafo.addEventListener('dragstart', event => {
        event.dataTransfer.setData('id', parrafo.id);
    });
});

papelera.addEventListener('dragover', event => {
    event.preventDefault();
});

papelera.addEventListener('drop', event => {
    const idParrafo = event.dataTransfer.getData('id');
    const parrafo = document.getElementById(idParrafo)
    parrafo.parentNode.removeChild(parrafo)
});