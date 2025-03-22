package instrucoes;

public class Exercicio {
    public static void main (String [] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração: " + i);
        }

        int[] numeros = {10, 20, 30};

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }   
}
