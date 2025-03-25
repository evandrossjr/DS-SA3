package Atividade07;

import java.util.Scanner;
//Lingua do P
public class Atividade07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        String mensagemCodificada = scanner.nextLine();
        scanner.close();

        // Decodificação
        StringBuilder mensagemDecodificada = new StringBuilder();
        for (int i = 0; i < mensagemCodificada.length(); i++) {
            if (mensagemCodificada.charAt(i) == 'p') {
                i++; // Ignora o 'p'
            }
            if (i < mensagemCodificada.length()) { // Verifica se não ultrapassou o limite
                mensagemDecodificada.append(mensagemCodificada.charAt(i));
            }
        }

        // Saída
        System.out.println(mensagemDecodificada.toString());
    }
}