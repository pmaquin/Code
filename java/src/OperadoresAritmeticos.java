public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        int x = 15;
        int y = 5;
        
        int soma = x + y;
        System.out.println("Soma: " + soma);

        int subtracao = x - y;
        System.out.println("Subtracao: " + subtracao);

        int multiplicacao = x * y;
        System.out.println("Multiplicação: " + multiplicacao);

        int divisao = x / y;
        System.out.println("Divisão: " + divisao);

        int modulo = x % y;
        System.out.println("Modulo: " + modulo);

        int incremento = 10;
        int decremento = 10;

        incremento++;
        System.out.println("Incremento: " + incremento);

        decremento--;
        System.out.println("Decremento: " + decremento);

        double exponencial = Math.pow(2, 2);
        System.out.println("Exponencial: " + exponencial);

        double raiz = Math.sqrt(x);
        System.out.println("Raiz quadrada de " + x + " é: " + raiz);

        double absoluto = Math.abs(-15);
        System.out.println("Valor absoluto de -15 é: " + absoluto);
        
    }
}
