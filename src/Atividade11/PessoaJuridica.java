package Atividade11;

import java.time.LocalDate;

public class PessoaJuridica extends Funcionario{
    private String cnpj;
    private LocalDate dataCriacao;

    public PessoaJuridica(String nome, double salario, String cnpj, LocalDate dataCriacao) {
        super(nome, salario);
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
    }


    @Override
    public void imprimeDados() {
        System.out.println("Nome Fantasia:" + nome + " CNPJ: " + cnpj + " Data de Crição: " + dataCriacao + " Salário: " + salario);

    }
}
