peso = float(input('Qual é o seu peso? '))
altura = float(input('Qual é sua altura? '))

imc = peso / (altura ** 2)

print('Seu imc é: ', imc)
print('Seu imc é o resultado entre {} / {} * {} e o resultado é {:.2f}'.format(peso, altura, altura, imc))
print(f'Seu IMC é: {imc:.2f}')

nome = str(input('Qual é o seu nome? '))
print(f'Prazer em te conhecer {nome:>20}')


n1 = int(input('Digite um valor: '))
n2 = int(input('Digite outro valor: '))
s = n1 + n2
sub = n1 - n2
m = n1 * n2
d = n1 / n2
di = n1 // n2
e = n1 ** n2
r = n1 * n2 * (1/2)

print(f'O resultado da soma é {s}, o resultado da subtração é {sub}, o resultado da multiplicação é {m}, o resultado da divisão é {d}, 
      o resultado da divisão inteira é {di}, o resultado da potência é {e} e da raiz quadrada de {e} é {r}'
      )


# Operadores aritiméticos:
# == é resultado
# + = adição // 5 + 2 == 7
# - = subtração // 5 - 2 == 3
# * = multiplicação // 5 * 2 == 10
# / = divisão // 5 / 2 == 2.5
# ** = potência // 5 ** 2 == 25
# // = divisão inteira // 5 // 2 == 2
# % = modulo ou resto da divisão // 5 % 2 == 1
# RAIZ QUADRADA = 5**2(1/2) == OU pow {(n, (1/2))}
#1 () = executa primeiro
#2 **
#3 *, /, //, %
#4 +, -


# \n = quebra a linha igual ao <br>
# , end=' ' = continua escrevendo na mesma linha
# ('' )
# print(type(var))
# = é recebe
# print = escrever
# var = resultado (variante recebe o resultado)
# int = numeros inteiros - 7, -4, 0, 1000
# float = numeros reais - 4.5, 0.076, -15.223, 7.0
# bool = True ou False - Precisa ser capitalizado
# str (string) = texto - 'ola', '7.0', '' (string fazia)

# :.2f = duas casa decimais
# :>2 = vai ficar duas casas a direita
# :<2 = vai ficar duas casas a esquerda
# :ˆ10 = vai centralizar, sendo 5 casas para a esquerda e 5 para a direita



#FRASES

frase = 'Curso em Video Python'



frase[9::3] 

analise = 'a'

len(frase) #comprimento da frase

frase.count('o', 0, 13) #contar quantas vezes a letra o minuscula aparece, depois colocamos as informações do fatiamento

frase.find('deo') #aonde começou a frase

frase.find('Android') #resultado que for False vai ser retornado como -1

'Curso' in frase #retorna True


transformacao = 'b'

frase.replace('Python', 'Android') #troca a palavra por outra

frase.upper() #deixa tudo em maiusculo

frase.lower() #deixa tudo em minusculo

frase.capitalize() #deixa a primeira letra das palavras em maiusculo

frase.title() #analisa quantas palavras tem e apos o espaço deixa a letra maiuscula

frase.strip() #remove os espaços inuteis

frase.rstrip() #remove somente os espaços da direita

frase.lstrip() #remove somente os espaços da esquerda

frase.split()

juncao = 'a'


'-'.join(frase) #preenche os espaços vazio com o -





#Cores:
#\033[0;33;44m
#stilo: 0 none, 1 bold, 4 underline, 7 negative
#text: 30 branco, 1 vermelho, 2 verde, 3 amarelo, 4 azul, 5 magente, 6 ciano, 7 cinza
#back: 40 branco, 1 vermelho, 2 verde, 3 amarelo, 4 azul, 5 magente, 6 ciano, 7 cinza