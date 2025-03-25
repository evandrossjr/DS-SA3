package Atividade08;

import java.util.Scanner;

public class Atividade08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Processar a entrada até encontrar 0
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break; // Encerrar ao encontrar 0
            }
            System.out.printf("f91(%d) = %d%n", n, f91(n));
        }

        scanner.close();
    }

    // Função recursiva f91
    public static int f91(int n) {
        if (n <= 100) {
            return f91(f91(n + 11));
        } else {
            return n - 10;
        }
    }
}

