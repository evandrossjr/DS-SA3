package Atividade09;

public class Apartamento extends Imovel implements Alugavel {

    private double valorAluguel;


    public Apartamento() {
    }


    public Apartamento(double valorImovel, double valorAluguel) {
        super(valorImovel);
        this.valorAluguel = valorAluguel;
    }

    @Override
    public double calcularValorAluguel() {

        return valorAluguel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }



}
