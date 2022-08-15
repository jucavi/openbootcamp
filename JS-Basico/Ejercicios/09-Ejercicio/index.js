const logger = require('./logger');

function alwaysThrowError() {
  console.log('Realizando un trabajo que inevitablemente fallará...');
  setTimeout(() => {console.log('Lo dicho... extrepitosamente!')}, 2000)
  throw new Error('Error lanzado desde la función custom')
}

try {
  alwaysThrowError()
} catch (e) {
  logger.error(e.message)
}