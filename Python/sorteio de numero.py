import random

numero_menor = int(input('Qual o menor número a ser sorteado? '))
numero_maior = int(input('Qual o maior número a ser sorteado? '))

sorteio = random.randint(numero_menor, numero_maior)

print(f'O número sorteado é: {sorteio}')

#Sorteio de names

import random

names = [
    input('Qual o primeiro nome? '),
    input('Qual o segundo nome? '),
    input('Qual o terceiro nome? '),
    input('Qual o quarto nome? '),
]

random.shuffle(names)

print(f'A sequencia da apresentação será: {','.join(names)}')