public class Operadores {
    
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Valor inicial de a = " + a);
        System.out.println("Valor inicial de b = " + b);

        a += 5; // Operador de Atribuição Composta (a = a + 5)
        b -= 2; // Operador de Atribuição Composta (b = b + 2)
        System.out.println("Valor de a após operação de atribuição: " + a);
        System.out.println("Valor de b após operação de atribuição: " + b);

        a *= 3; // Operador de Atribuição Composta (a = a * 5)
        b /= 2; // Operador de Atribuição Composta (b = b / 5)
        System.out.println("Valor de a após operação de atribuição: " + a);
        System.out.println("Valor de b após operação de atribuição: " + b);

    }
}
