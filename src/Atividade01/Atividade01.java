package Atividade01;

//Fatorial
public class Atividade01 {

    private int numero;
    private int fatorial;
    private int i;

    public Atividade01(){}

    public Atividade01( int numero, int fatorial) {
        this.numero = numero;
        this.fatorial = fatorial;

    }

    public void calculoFatorial(int numero) {

        if (numero == 0) {
            fatorial = 1;
            System.out.println("Fatorial " + fatorial);
        }

        if (numero >= 1 && numero <= 12) {
            fatorial=1;
            for (i = numero; i > 0; i--) {
                fatorial *= i;

            }
        }
        System.out.println("Fatorial " + fatorial);

    }

}
