def numero_primo():
    numero = int(input('Ingrese un número entero: '))

    if numero < 1:
        return 'No es primo'

    for i in range(2, int(numero)):
        if (int(numero) % i) == 0:
            return 'El número {numero} no es primo'
        else:
            return f'El numero {numero} es primo'
