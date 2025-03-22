Algoritmo "NotasDe5Aluno"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
nomes: vetor [1..5] de caracter
notas: vetor [1..5] de real
contadorLoop1: inteiro
soma, media: real

Inicio
soma <- 0

PARA contadorLoop1 DE 1 ATE 5 FACA
     ESCREVA("Qual o nome do aluno", contadorLoop1, " de 5:")
     LEIA(nomes[contadorLoop1])
     ESCREVA("Qual a nota do aluno", contadorLoop1, " de 5:")
     LEIA(notas[contadorLoop1])
     soma <- soma + notas[contadorLoop1]
FIMPARA

PARA contadorLoop1 DE 1 ATE 5 FACA
     ESCREVAL("O aluno ", nomes[contadorLoop1], " tirou a nota:", notas[contadorLoop1])
FIMPARA

media <- soma / contadorLoop1
ESCREVA("A media de Notas das Turmas é: ", media)


Fimalgoritmo