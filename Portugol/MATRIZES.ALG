Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/03/2025
Var
// Se��o de Declara��es das vari�veis 
numeros: vetor [1..3,1..2] de inteiro
i, j: inteiro
soma: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
soma <- 1
   PARA i DE 1 ATE 3 FACA
        PARA j DE 1 ATE 2 FACA
             soma <- soma + 2
             numeros[i, j] <- soma
        FIMPARA
   FIMPARA
   
   PARA i DE 1 ATE 3 FACA
        PARA j DE 1 ATE 2 FACA
             ESCREVAL("o valor para a linha ", i, " e coluna ", j, " : ")
             ESCREVAL(numeros[i, j])
        FIMPARA
   FIMPARA

Fimalgoritmo