import math

cateto_oposto = float(input('Qual o comprimento do cateto oposto? '))
cateto_adjacent = float(input('Qual o comprimento do cateto adjacent? '))

hipotenusa = math.hypot(cateto_oposto, cateto_adjacent)

print(f'A hipotenusa é: {hipotenusa:.2f}')