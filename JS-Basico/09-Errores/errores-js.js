const miFunction = (val) => {
    if (typeof val === 'number') {
        return 2 * val;
    }
    throw new Error('El valor debe ser de tipo número');
};

const numero = 8;

try {
    console.log('Esta ejecutándose de manera correcta');
    const doble = miFunction(numero);
    console.log(doble);
} catch (e) {
    console.log(`El error es: ${e}`);
    console.error('Error');
} finally {
    console.log(
        'Esto será ejecutado tanto si se produce algún error como si no'
    );
}

// InternalError, SyntaxError, TypeError, RangeError, y ReferenceError
