public class TabelaVerdade {
    public static void main(String [] args) {
        System.out.println("Tabela Verdade para o Operador AND (&&):");
        System.out.println("A\tB\tA && B");
        System.out.println(true + "\t" + true + "\t" + (true && true));
        System.out.println(true + "\t" + false + "\t" + (true && false));
        System.out.println(false + "\t" + true + "\t" + (false && true));
        System.out.println(false + "\t" + false + "\t" + (false && false));

        System.out.println();
        System.out.println("Tabela Verdade para o Operador OR (||)");

        System.out.println("A\tB\tA || B");
        System.out.println(true + "\t" + true + "\t" + (true || true));
        System.out.println(true + "\t" + false + "\t" + (true || false));
        System.out.println(false + "\t" + true + "\t" + (false || true));
        System.out.println(false + "\t" + false + "\t" + (false || false));
    

    }
}
