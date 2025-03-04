import java.util.Arrays; // Import necessário para Arrays.toString()

public class Vetores {
    public static void main (String [] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};
        
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        String[] nomes = new String[3];

        System.out.println("Vetor de números inicializados: " + Arrays.toString(numbers));
        System.out.println("Vetor de números inicializados manualmente: " + Arrays.toString(numeros));

        System.out.println("Valores do vetor usando FOR:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elementos na posição [" + i + "]:" + numbers[i]);
        }
        
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixTamFixo = new int [2][2];

        System.out.println("\nValores da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
