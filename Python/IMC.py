nome = str(input('Qual o seu nome? ')).strip().capitalize()
peso = float(input('Qual o seu peso: '))
altura = float(input('Qual a sua altura? '))
imc = peso / altura ** 2

if imc < 18.5:
    classificado = 'Magreza'
elif 18.5 <= imc <= 24.9:
    classificado = 'Normal'
elif 25 <= imc <= 29.9:
    classificado = 'Sobrepeso'
elif 30 <= imc <= 39.9:
    classificado = 'Obesidade'
else:
    classificado = 'Obesidade Grave'

print(f'{nome} seu IMC é {imc:.2f} e conforme a tabela você é considerado {classificado}')