// Uso de break y continue  dentro de los bucles
let lista = [1, 2, 3, 4, 5];
for (let k = 0; k < lista.length - 1; k++) {
    if (lista[k] > 4) break;
    if (lista[k] === 3) continue;
    console.log(lista[k]);
}

// Ambito de un bucle
console.log(k);
