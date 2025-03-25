package Atividade11;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class PessoaFisica extends Funcionario{

    private String cpf;
    private LocalDate dataNascimento;

    public PessoaFisica(String nome, double salario, String cpf, LocalDate dataNascimento) {
        super(nome, salario);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome:" + nome + " CPF: " + cpf + " Data de Nascimento: " + dataNascimento + " Salário: " + salario);
    }
}
