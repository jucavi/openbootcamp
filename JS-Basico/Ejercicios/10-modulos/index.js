import { suma, multiplica } from './modules/controller.js';
import chalk from 'chalk';

const sum = suma(1, 2);
console.log(sum);

const mul = multiplica(4, 5);
console.log(chalk.green.bold(mul));

