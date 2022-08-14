// Carga y sobrecarga de funciones
function saludar() {
    hola();
}

function hola() {
    console.log('Hola soy la función hola()');
}

saludar();

/// stack ///
/// 1. global()
/// 2. saludar global()
/// 1. hola saludar global()
/// 1. saludar global()
/// 1. global()
