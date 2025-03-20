package instrucoes;

public class ControlesRepeticao {
    public static void main (String [] args) {
        System.out.println("BREAK");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Encerra o loop quando i é igual a 5 (GAMBIARRA)
            }
            System.out.println("Iteração: " + i);
        }

        System.out.println("\nCONTINUEx");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Puta a iteração para números pares
            }
            System.out.println("Iteração impar: " + i);
        }
    }
}
