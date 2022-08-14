const ahora = new Date();
console.log(ahora);

const cumpleanyos = new Date(1978, 01, 21);
console.log(cumpleanyos);

const esMasTarde = ahora > cumpleanyos;
console.log(esMasTarde);

const diaNacimiento = cumpleanyos.getDate();
console.log(diaNacimiento);

const mesNacimiento = cumpleanyos.getMonth();
console.log(mesNacimiento + 1);

const anyoNacimiento = cumpleanyos.getFullYear();
console.log(anyoNacimiento);
