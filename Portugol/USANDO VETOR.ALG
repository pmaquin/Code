Algoritmo "NotasDe5Aluno"

Var
nomes: vetor [1..5] de caracter
notas: vetor [1..5] de real
contadorLoop1: inteiro
soma: real

Inicio
PARA contadorLoop1 DE 1 ATE 5 FACA
     ESCREVA("Qual o nome do aluno", contadorLoop1, ":")
     LEIA(nomes[contadorLoop1])
FIMPARA

PARA contadorLoop1 DE 1 ATE 5 FACA
     ESCREVA("Qual a nota do aluno", contadorLoop1, ":")
     LEIA(notas[contadorLoop1])
FIMPARA

PARA contadorLoop1 DE 1 ATE 5 FACA
     ESCREVAL("O aluno ", nomes[contadorLoop1], " tirou a nota:", notas[contadorLoop1])
FIMPARA

PARA contadorLoop1 DE 1 ATE 5 FACA


Fimalgoritmo