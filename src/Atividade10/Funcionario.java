package Atividade10;

public class Funcionario extends Pessoa {
    private double salario;


    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() + ", salario: " + getSalario();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}

