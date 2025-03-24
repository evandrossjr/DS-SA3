package Atividade04;

import java.util.Arrays;
import java.util.Scanner;

//Carnaval
public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            double nota;
            do {
                nota = scanner.nextDouble();
                if (nota < 5.0 || nota > 10.0) {
                    System.out.println("Nota inválida! Insira uma nota entre 5.0 e 10.0:");
                }
            } while (nota < 5.0 || nota > 10.0);

            notas[i] = nota;
        }

        double notaFinal = calcularNotaFinal(notas);
        System.out.printf("%.1f\n", notaFinal);

        scanner.close();
    }

    private static double calcularNotaFinal(double[] notas) {
        Arrays.sort(notas); // coloca as notas em ordem crescente
        return notas[1] + notas[2] + notas[3]; //exclui os as notas[0] e notas[5]
    }
}