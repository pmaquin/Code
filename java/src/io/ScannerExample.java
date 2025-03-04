package io;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Iniciar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê o nome do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê a idade do usuário como inteiro

        scanner.nextLine(); // Consome a quebra de linha residual após o nextInt()

        System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");

        // Encerar
        scanner.close();
    }
}
