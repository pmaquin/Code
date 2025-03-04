package instrucoes;

public class InstrucoesRepeticao {
    public static void main(String [] args) {

        // 1. Estrutura for
        System.out.println("Estrutura for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("1 = " + i);
        }

        // 2. Estrutura while
        System.out.println("\nEstrutura while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 3. Estrutura do-while
        int k = 1;
        do {
            System.out.println("\nEstrutura do-while");
            k++;
        } while (k <= 5);

    }
}
