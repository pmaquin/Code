// Declaração da classe chamada "HelloWorld".
// Em Java, todo código deve estar dentro de uma classe.
public class HelloWorld { 

    /*
     * public: Modificador de acesso que significa que a classe pode ser acessada de qualquer lugar.
     * class: Palavra-chave usada para definir uma classe em Java.
     * HelloWorld: Nome da classe. O nome da classe deve começar com letra maiúscula e 
     * deve ser o mesmo do nome do arquivo (HelloWorld.java).
     */

    // Declaração do método principal (main), que é o ponto de entrada do programa.
    public static void main(String[] args) { 
        
        /*
         * Esse é o método principal (main) do programa Java. É o ponto de entrada da aplicação.
         *
         * public: 
         * - Torna o método acessível de qualquer lugar.
         * - Se fosse "private", por exemplo, não poderia ser chamado pela JVM.
         *
         * static:
         * - Permite chamar o método sem precisar instanciar um objeto da classe.
         * - Se não fosse "static", precisaríamos criar um objeto de HelloWorld para chamar main(), assim:
         *      HelloWorld obj = new HelloWorld();
         *      obj.main(args);
         * - Como a JVM precisa chamar esse método automaticamente sem criar um objeto, ele deve ser "static".
         *
         * void:
         * - Indica que o método não retorna nenhum valor.
         * - Poderia ser substituído por um tipo de retorno (exemplo: "int"), mas precisaríamos modificar o código para retornar algo.
         * - Exemplo alternativo:
         *      public static int main(String[] args) {
         *          return 0; // Retornaria um valor inteiro
         *      }
         *
         * main:
         * - Nome do método especial que será executado primeiro pela JVM.
         * - Se mudar o nome de "main" para outra coisa, o programa não será executado corretamente.
         *
         * String[] args:
         * - Um array de strings que pode receber argumentos passados na linha de comando.
         * - Exemplo: Se executarmos "java HelloWorld teste", "teste" será armazenado em args[0].
         */

        // Comando para imprimir "Hello, world!" no console.
        System.out.println("Hello, world!"); 

        // 8 bits, intervalo de -128 a 127
        byte oitoBits = 100;
        System.out.println(oitoBits);

        // 16 bits, intervalo de -32,768 a 32,767
        short numeroMuitoPequeno = 32;
        System.out.println(numeroMuitoPequeno);
        
        // 32 bits, intervalo de -2^31 a 2^31-1
        int inteiro = 32000;
        System.out.println(inteiro);

        // 64 bits, intervalo de -2^63 a 2^63-1
        long numeroMuitoGrande = 164000;
        System.out.println(numeroMuitoGrande);

        // 32 bits, ponto flutuande de precisão simples
        float decimalSimples = 31;
        System.out.println(decimalSimples);

        // 64 bits, ponto flutuande de precisão dupla
        double decimalPreciso = 34.5;
        System.out.println(decimalPreciso);

        // 16 bits, caracter Unicode
        char caractere = 'a';
        System.out.println(caractere);

        // true ou false
        boolean teste = true;
        System.out.println(teste);   

        /*
         * System.out: 
         * - Representa a saída padrão do sistema (console).
         * - "out" é um objeto do tipo PrintStream que gerencia a saída de dados.
         *
         * println(): 
         * - Método que imprime uma mensagem e pula para a próxima linha.
         * - Existe também "print()", que imprime sem pular de linha.
         *
         * "Hello, world!": 
         * - Texto que será exibido no console.
         */
    }
}
