Algoritmo "IMC"
// Disciplina   : Criando Aplicações e Sistema
// Professor   :
// Descrição   : Estudando Portugol
// Autor(a)    : Paulo Aquino
// Data atual  : 03/03/2025

Var
// Seção de Declarações das variáveis
peso, altura, imc: real
op, i, ee, rr: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
    ESCREVA("Qual o seu peso? ")
    LEIA(peso)

    ESCREVA("Qaul a sua altura? ")
    LEIA(altura)

    imc <- peso / (altura * altura)

    SE (imc < 17.9) ENTAO
        ESCREVAL("Seu imc é: ", imc:2, " e é consigo Abaixo do Peso Normal")
        SENAO
            SE (imc > 18) E (imc < 24.9) ENTAO
                ESCREVAL("Seu imc é: ", imc:2, " e é considerado Peso Normal")
        SENAO
            SE (imc > 25) E (imc < 29.9) ENTAO
                ESCREVAL("Seu imc é: ", imc:2, " e é considerado Sobrepeso")
        SENAO
            SE (imc > 30) E (imc < 34.9) ENTAO
            ESCREVAL("Seu imc é: ", imc:2, " e é considerado Obesidade de Grau I")
        SENAO
            ESCREVAL("Seu imc é: ", imc:2, " e é considerado Obesidade de Grau II, procure um médico")
            FIMSE
            FIMSE
            FIMSE
    FIMSE
    
    ESCREVAL("Para chegar no resultado que você quer, você tem duas opções:")
    ESCREVAL("1 - Fazer academia e dieta.")
    ESCREVAL("2 - Falhar e continuar fudido.")
    ESCREVAl("Qual opção que você prefere? ")
    LEIA(op)

    ESCOLHA(op)
               CASO 1
                    ESCREVAL("Parabens, você escolheu a opção correta")
               CASO 2
                    ESCREVAL("Parabens, você é um fudido!")
    FIMESCOLHA
    
    PARA i DE 1 ATE 3 FACA
        ESCREVAL(i)
    FIMPARA
    
    ESCREVAL("...")
    ESCREVAL("BORA TREINAR FRANGO!!!")
    
    ESCREVAL("Qual seu peso atualizado frango? ")
    
    ee <- 1
    ENQUANTO ee < 5 FACA
             ESCREVAL("Valor de EE: ", ee)
             ee <- ee + 1
    FIMENQUANTO
    
    rr <- 1
    REPITA
          ESCREVAL("Valor de RR: ", rr, " REPITA")
          rr <- rr + 1
    ATE rr >= 5
    
Fimalgoritmo