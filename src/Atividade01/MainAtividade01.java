package Atividade01;

import java.util.Scanner;

public class MainAtividade01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println(numero);


        Atividade01 at1 = new Atividade01();
        at1.calculoFatorial(numero);

    }
}
