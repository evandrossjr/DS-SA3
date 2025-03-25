package Atividade11;

import Atividade11.Funcionario;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class MainAtividade11 {


    public static void imprimirDados(Funcionario funcionario){
        funcionario.imprimeDados();
    }

    public static void main(String[] args) {
        Funcionario pessoaFisica = new PessoaFisica("Evandro", 5250.00,"1234578910", LocalDateTime.parse("1989-03-02T01:00:00").toLocalDate());
        Funcionario pessoaJuridica = new PessoaJuridica("EvTech",10000.00 ,"987654321", LocalDate.now());

        imprimirDados(pessoaFisica);
        imprimirDados(pessoaJuridica);

    }


    }

