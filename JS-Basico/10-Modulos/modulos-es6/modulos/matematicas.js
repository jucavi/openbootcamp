export function suma(a, b) {
    return a + b;
}

export function multiplica(a, b) {
    return a * b;
}

export function factorial(n) {
    if (n < 2) return 1;
    let factorial = 1;
    for (let i = 2; i <= n; i++) {
        factorial *= i;
    }
    return factorial;
}


export const nombre = 'Matematicas';
