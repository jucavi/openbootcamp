// console.log('Estoy lanzado por pantalla un mensaje');
// console.info('Estoy lanzado por pantalla un mensaje de información');
// console.warn('Estoy lanzado por pantalla un mensaje de advertencia');
// console.debug('Estoy lanzado por pantalla un mensaje de debug');
// console.error('Estoy lanzado por pantalla un mensaje de error');
const logger = require('./logger');

// logger.log('Estoy lanzado por pantalla un mensaje');
logger.debug('Estoy lanzado por pantalla un mensaje de debug');
logger.info('Estoy lanzado por pantalla un mensaje de información');
logger.warn('Estoy lanzado por pantalla un mensaje de advertencia');
logger.error('Estoy lanzado por pantalla un mensaje de error');