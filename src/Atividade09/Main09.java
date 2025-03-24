package Atividade09;

public class Main09 {
    public static void main(String[] args) {


        Apartamento ap304 = new Apartamento(150000.00,2500.00);

        System.out.println("Valor do Imóvel: R$ " + ap304.calcularValor());
        System.out.println("Valor do Aluguel: R$ " + ap304.calcularValorAluguel());

        System.out.println("FIm");

    }
}
