package Atividade01;

import java.util.Scanner;

public class MainAtividadeUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println(numero);


        AtividadeUm at1 = new AtividadeUm();
        at1.calculoFatorial(numero);

    }
}
