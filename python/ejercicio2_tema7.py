import time

tiempo_ahora = time.localtime()
hora_de_salida = 22

if tiempo_ahora.tm_hour >= hora_de_salida:
    print('Party time!!!!')
else:
    print(f'{hora_de_salida - tiempo_ahora.tm_hour} horas  y  {59 - tiempo_ahora.tm_min} aun para ir a casa')
