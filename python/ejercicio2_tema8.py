import pickle

class Vehiculo:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.marcha = 0
        self.en_marcha = False

    def arrancar(self):
        self.en_marcha = True

    def aumentar_marcha(self):
        self.marcha += 1

    def detener(self):
        self.marcha = 0

    def apagar(self):
        self.detener()
        self.en_marcha = False

    def __str__(self):
        return f'{self.marca}-{self.modelo}'


vehiculo = Vehiculo('Maia', 'Merope')
vehiculo.arrancar()
vehiculo.aumentar_marcha()

f = open('estado.dat', 'wb')
pickle.dump(vehiculo, f)
f.close()

vehiculo.apagar()

f = open('estado.dat', 'rb')
vehiculo_guardado = pickle.load(f)
f.close()

print(f'Estado actual de {vehiculo}: En marcha {vehiculo.en_marcha}')
print(f'Estado guardado de {vehiculo_guardado}: En marcha {vehiculo_guardado.en_marcha}')