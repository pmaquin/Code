Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/03/2025
Var
// Seção de Declarações das variáveis 
numeros: vetor [1..3,1..2] de inteiro
i, j: inteiro
soma: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
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