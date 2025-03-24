package Atividade05;

import java.util.Scanner;

//Flipper
public class Atividade05 {
    public static void main(String[] args) {
        // Criar o scanner para leitura da entrada
        Scanner scanner = new Scanner(System.in);

        // Ler os dois números P e R
        int P = scanner.nextInt();
        int R = scanner.nextInt();

        // Fechar o scanner
        scanner.close();

        // Condições para determinar o caminho da bolinha
        if (P == 1 && R == 0) {
            System.out.println("B");
        } else if (P == 1 && R == 1) {
            System.out.println("A");
        } else if (P == 0 && R == 0) {
            System.out.println("C");
        } else if (P == 0 && R == 1) {
            System.out.println("C");
        }
    }
}

