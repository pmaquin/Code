package instrucoes;

public class EstruturasCondicionais {
    
    public static void main(String [] args){
        int numero = 10;

        // 1. Estrutura if
        if (numero > 0) {
            System.out.println("O número é positivo.");
        }

        // 2. Estrutura if-else
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }

        // 3. estrutura if-else if-else (ANINHADO)
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
