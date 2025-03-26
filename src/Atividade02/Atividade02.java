package Atividade02;

import java.util.Scanner;

//Posição i-enesima
public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instância para possibilitar a entrada de dados via teclado
        int teste = 1; // o teste começa com 1

        while (true) { // loop infinito que só termina quando o n for igual a 0
            int n = scanner.nextInt();
            if (n == 0) break;

            int[] participantes = new int[n]; //criando um array com os participantes
            for (int i = 0; i < participantes.length; i++) { // o laço for é de acordo com o numeto de participantes (n)
                participantes[i] = scanner.nextInt();
            }

            int ganhador = encontrarGanhador(participantes);
            System.out.println("Teste " + teste);
            System.out.println(ganhador);
            System.out.println();
            teste++;
        }
        scanner.close();
    }

    private static int encontrarGanhador(int[] participantes) {
        for (int i = 0; i < participantes.length; i++) { // aqui acontece o loop onde verifica se o numero do ingresso
            if (participantes[i] == i + 1) { // é o mesmo do participante
                return participantes[i];
            }
        }
        throw new IllegalStateException("Nenhum ganhador encontrado.");
    }
}


