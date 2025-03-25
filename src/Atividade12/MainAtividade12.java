package Atividade12;

import Atividade11.Funcionario;
import Atividade11.PessoaFisica;
import Atividade11.PessoaJuridica;

import java.time.LocalDate;

public class MainAtividade12 {

    public static void main(String[] args) {

        Funcionario pessoaFisica2 = new PessoaFisica("Evandro",4000, "123456", LocalDate.now() );

        pessoaFisica2.imprimeDados();
    }
}
