import math

angulo = float(input('Qual o valor do angulo em graus? '))

radianos = math.radians(angulo)

seno = math.sin(radianos)
coseno = math.cos(radianos)
tangente = math.tan(radianos)


print(f'O angulo tem: {angulo}. E o valor de seno é {seno:.4f}, o valor do coseno é {coseno:.4f} e o valor da tangente é {tangente:.4f}')