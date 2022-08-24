const form = document.getElementById('nombre');

console.log(form);

form.addEventListener('submit', event => {
    console.log(event)
    event.preventDefault();
});