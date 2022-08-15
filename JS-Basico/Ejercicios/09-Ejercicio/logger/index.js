const winston = require('winston');

const logger = winston.createLogger({
  level: 'info',
  format: winston.format.json(),
  defaultMeta: { service: 'app-service' },
  transports: [
    new winston.transports.File({ filename: 'ejercicio_09.log' })
  ]
});

module.exports = logger;