package Atividade03;

import java.util.Scanner;

//Cartas
public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cartas = new int[5];

        for (int i = 0; i < 5; i++) {
            cartas[i] = scanner.nextInt();
        }

        char resultado = verificarOrdem(cartas);
        System.out.println(resultado);

        scanner.close();
    }

    private static char verificarOrdem(int[] cartas) {
        boolean crescente = true, decrescente = true;

        for (int i = 0; i < 4; i++) {
            if (cartas[i] < cartas[i + 1]) { //compara se o numero atual é menor que o seguinte
                decrescente = false; //sendo menor o decrescente é falso e o crescente é verdadeiro
            } else if (cartas[i] > cartas[i + 1]) { //compara se o numero atual é maior que o seguinte
                crescente = false; //sendo maior o decrescente é verdadeiro e o crescente é falso
            }
        }

        if (crescente) return 'C'; //se todos os numeros retornarm crescente
        if (decrescente) return 'D'; // se todos os numeros retornaram decrescente
        return 'N'; // se ao menos um numero for diferente dos demais
    }
}
