numero_inicial = int(input('Ingrese el nùmero de inicio: '))
numero_final = int(input('Ingrese el nùmero final:'))

if numero_inicial % 2 == 0:
    numero_inicial += 1

while numero_final > numero_inicial:
    print(numero_inicial)
    numero_inicial += 2
    
