from functools import reduce

def suma_impares(lista):
    impares = list(filter(lambda x: x % 2 != 0, lista))
    return reduce(lambda x, y: x + y, impares, 0)

lista = list(range(17))

print(suma_impares(lista))



