Algoritmo "IMC"
// Disciplina   : Criando Aplica��es e Sistema
// Professor   :
// Descri��o   : Estudando Portugol
// Autor(a)    : Paulo Aquino
// Data atual  : 03/03/2025

Var
// Se��o de Declara��es das vari�veis
peso, altura, imc: real
op, i, ee, rr: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
    ESCREVA("Qual o seu peso? ")
    LEIA(peso)

    ESCREVA("Qaul a sua altura? ")
    LEIA(altura)

    imc <- peso / (altura * altura)

    SE (imc < 17.9) ENTAO
        ESCREVAL("Seu imc �: ", imc:2, " e � consigo Abaixo do Peso Normal")
        SENAO
            SE (imc > 18) E (imc < 24.9) ENTAO
                ESCREVAL("Seu imc �: ", imc:2, " e � considerado Peso Normal")
        SENAO
            SE (imc > 25) E (imc < 29.9) ENTAO
                ESCREVAL("Seu imc �: ", imc:2, " e � considerado Sobrepeso")
        SENAO
            SE (imc > 30) E (imc < 34.9) ENTAO
            ESCREVAL("Seu imc �: ", imc:2, " e � considerado Obesidade de Grau I")
        SENAO
            ESCREVAL("Seu imc �: ", imc:2, " e � considerado Obesidade de Grau II, procure um m�dico")
            FIMSE
            FIMSE
            FIMSE
    FIMSE
    
    ESCREVAL("Para chegar no resultado que voc� quer, voc� tem duas op��es:")
    ESCREVAL("1 - Fazer academia e dieta.")
    ESCREVAL("2 - Falhar e continuar fudido.")
    ESCREVAl("Qual op��o que voc� prefere? ")
    LEIA(op)

    ESCOLHA(op)
               CASO 1
                    ESCREVAL("Parabens, voc� escolheu a op��o correta")
               CASO 2
                    ESCREVAL("Parabens, voc� � um fudido!")
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