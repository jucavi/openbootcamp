from django.shortcuts import render
from .models import Director


def index(request):
    directors = Director.objects.all()

    return render(
        request,
        'index.html',
        context={
            'directors':directors
        }
    )
