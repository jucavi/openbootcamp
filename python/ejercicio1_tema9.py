paises = input('Ingrese una lista de paises separados por comas: ')
paises = set(map(lambda x: x.strip().capitalize(), paises.split(',')))
print(', '.join(sorted(paises)))