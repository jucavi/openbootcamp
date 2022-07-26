from django.db import models

class Director(models.Model):
    first_name = models.CharField(max_length=20)
    last_name = models.CharField(max_length=30)
    date_of_birth = models.DateField(null=True, blank=True)
    date_of_death = models.DateField('Died', null=True, blank=True)


    def __str__(self) -> str:
        return f'{self.last_name}, {self.first_name}'


class Genre(models.Model):
    name = models.CharField(max_length=20)

    def __str__(self):
        return self.name


class Movie(models.Model):
    title = models.CharField(max_length=40)
    duration = models.PositiveIntegerField('Duracion', help_text='Duración en minutos')
    year = models.PositiveIntegerField('Año', help_text='Año de lanzamiento')
    classification = models.CharField(max_length=40, help_text='Clasificación')
    genre = models.ForeignKey(Genre, on_delete=models.SET_NULL, null=True)
    directors = models.ManyToManyField(Director)

    def __str__(self):
        return f'{self.title} | {self.genre} | {self.duration} min | {self.year} | {self.classification}'