nome = str(input('Qual o seu nome completo? ')).strip()
separa = nome.split()


print('Analisando o seu nome...')
print(f'Seu nome em maiusculas é {nome.upper()}')
print(f'Seu nome em minusculas é {nome.lower()}')
print(f'Seu nome tem ao todo {len(nome) - nome.count(' ')} letras')
print(f'Seu primeiro nome é {separa[0]} e ele tem {len(separa[0])} letras')