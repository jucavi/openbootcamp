// Con el uso de break
let unidades = 0;
let decenas = 0;

while (true) {
  while (true) {
    console.log(`El número actual es: ${decenas}${unidades}`);
    unidades++;
    if (unidades === 10) {
      unidades = 0;
      break;
    }
  }
  decenas++;
  if (decenas === 2) break;
}



// Usando labels
unidades = 0;
decenas = 0;
bucleDecenas: while (true) {
    bucleUnidades: while (true) {
      if (decenas === 2) break bucleDecenas;
      console.log(`El número actual es: ${decenas}${unidades}`);
      unidades++;
      if (unidades === 10) {
          unidades = 0;
          break bucleUnidades;
      }
    }
    decenas++;
}
