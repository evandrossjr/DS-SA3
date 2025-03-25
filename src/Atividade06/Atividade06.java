package Atividade06;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //leitura do número de alunos


        int[] frequencia = new int[101];  // araay com a contagwem das notas Índices de 0 a 100


        for (int i = 0; i < N; i++) { // Lê as notas e atualiza a frequência
            int nota = scanner.nextInt();
            frequencia[nota]++;
        }

        // Variáveis para armazenar a nota mais frequente e a sua frequência
        int notaMaisFrequent = -1;
        int maxFrequencia = 0;

        // Encontrar a nota mais frequente (em caso de empate, escolhemos a maior)
        for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > maxFrequencia || (frequencia[i] == maxFrequencia && i > notaMaisFrequent)) {
                maxFrequencia = frequencia[i];
                notaMaisFrequent = i;
            }
        }


        System.out.println("A nota mais frequente é: " + notaMaisFrequent);


        scanner.close();
    }
}

