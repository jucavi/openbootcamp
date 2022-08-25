const draggables = document.querySelectorAll('p[draggable=true]');
const secciones = document.querySelectorAll('.seccion')

draggables.forEach(parrafo => {
    parrafo.addEventListener('dragstart', event => {
        parrafo.classList.add('dragin')
        event.dataTransfer.setData('id', parrafo.id)

        const elementoFantasma = document.querySelector('.imagen-fantasma')
        event.dataTransfer.setDragImage(elementoFantasma, 0, 0)
    });

    parrafo.addEventListener('dragend', event => {
        parrafo.classList.remove('dragin')
    });
});

secciones.forEach(seccion => {
    seccion.addEventListener('dragover', event => {
        event.preventDefault()
        // event.dataTransfer.dropEffect = 'link'
        // event.dataTransfer.dropEffect = 'move'
        // event.dataTransfer.dropEffect = 'none'
    });

    seccion.addEventListener('drop', event => {
        const idParrafo = event.dataTransfer.getData('id')
        // console.log(idParrafo)
        const parrafo = document.getElementById(idParrafo)
        seccion.appendChild(parrafo)
    });
});