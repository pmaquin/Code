package funcoes;

public class FuncoesRecursivas {
    // Método recursivo para calcular o fatorial

    // n! = n * (n - 1) * (n - 2) * ...

    int fatorial(int n) {
        // Caso base: fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva: n * fatorial de n(-1)
            return n * fatorial(n-1);
        }
    }

    public static void main(String [] args) {
        FuncoesRecursivas exemplo = new FuncoesRecursivas();
        int numero = 5;
        int resultado = exemplo.fatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}
