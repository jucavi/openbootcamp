class Vehiculo():
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

    def __str__(self):
        return f'Color {self.color}, {self.ruedas} ruedas, {self.puertas} puertas'


class Coche(Vehiculo):
    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        super().__init__(color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def __str__(self):
        return super().__str__() + f', {self.velocidad} km/h, {self.cilindrada} cc'


coche = Coche('rojo', 4, 5, 120, 90)
print(coche)
