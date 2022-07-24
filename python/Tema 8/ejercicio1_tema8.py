lista = [
    '1. Ver si la planta vive',
    '2. Regar la planta, si es que vive',
    '3. Hacer jardin zen en el salón',
    '4. Garantizar que no tenga plantas'
]


def escribe(fichero, data):
    with open(fichero, 'w') as f:
        for linea in data:
            if not linea.endswith('\n'):
                linea += '\n'
            f.write(linea)


def lee(fichero):
    with open(fichero, 'r') as f:
        print(f.read())


def main():
    escribe('fichero.txt', lista)
    lee('fichero.txt')


if __name__ == '__main__':
    main()