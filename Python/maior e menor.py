from time import sleep

a = float(input('Primeiro valor: '))
b = float(input('Segundo valor: '))
c = float(input('Terceiro valor: '))

menor = a
if b < a and b < c:
    menor = b
if c < a and c < b:
    menor = c

maior = a
if b > a and b > c:
    maior = b
if c > a and c > b:
    maior = c

print(f'O menor valor é o {menor}')
print(f'O mair valor foi o {maior}')



#if primeiro < segundo and primeiro < terceiro:
    #print(f'O menor valor digitado foi: {primeiro}')
#elif segundo < primeiro and segundo < terceiro:
   # print(f'O menor valor digitado foi: {segundo}')
#else:
    #print(f'O menor valor digitado foi: {terceiro}')

#if primeiro > segundo and primeiro > terceiro:
   # print(f'O maior valor digitado foi: {primeiro}')
#elif segundo > primeiro and segundo > terceiro:
    #print(f'O maior valor digitado foi: {segundo}')
#else:
    #print(f'O maior valor digitado foi: {terceiro}')
