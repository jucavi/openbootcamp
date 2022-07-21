class Alumno():
    def __init__(self, nombre, nota):
        self.nombre = nombre.title()
        self.nota = nota

    def resultado_examen(self):
        if self.nota < 5:
            return f'{self.nombre} has suspendido'

        return f'Enhorabuena {self.nombre} estas aprobado'

    def __str__(self):
        return f'{self.nombre} con nota {self.nota:.2f}'



alumno1 = Alumno('Juan', 3)
alumno2 = Alumno('Maria', 9)

print(alumno1)
print(alumno2)

print(alumno1.resultado_examen())
print(alumno2.resultado_examen())

