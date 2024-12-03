package com.escola.main;

import com.escola.model.*;
import com.escola.servico.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroFuncionarioServico cadastroServico = new CadastroFuncionarioServico();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Cadastrar Secretário");
            System.out.println("3. Cadastrar Diretor");
            System.out.println("4. Listar Funcionários");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Para consumir a linha extra

            if (escolha == 1) {
                // Cadastro de Professor
                System.out.println("Nome do Professor: ");
                String nome = scanner.nextLine();
                System.out.println("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha
                System.out.println("CPF: ");
                String cpf = scanner.nextLine();
                System.out.println("Disciplina: ");
                String disciplina = scanner.nextLine();

                Professor professor = new Professor(nome, idade, cpf, disciplina);
                cadastroServico.adicionarFuncionario(professor);

            } else if (escolha == 2) {
                // Cadastro de Secretário
                System.out.println("Nome do Secretário: ");
                String nome = scanner.nextLine();
                System.out.println("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha
                System.out.println("CPF: ");
                String cpf = scanner.nextLine();
                System.out.println("Setor: ");
                String setor = scanner.nextLine();

                Secretario secretario = new Secretario(nome, idade, cpf, setor);
                cadastroServico.adicionarFuncionario(secretario);

            } else if (escolha == 3) {
                // Cadastro de Diretor
                System.out.println("Nome do Diretor: ");
                String nome = scanner.nextLine();
                System.out.println("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha
                System.out.println("CPF: ");
                String cpf = scanner.nextLine();
                System.out.println("Ano de Início: ");
                int anoInicio = scanner.nextInt();

                Diretor diretor = new Diretor(nome, idade, cpf, anoInicio);
                cadastroServico.adicionarFuncionario(diretor);

            } else if (escolha == 4) {
                // Listar Funcionários
                cadastroServico.listarFuncionarios(cadastroServico.getFuncionarios());

            } else if (escolha == 5) {
                // Sair
                System.out.println("Saindo...");
                break;
            }
        }
    }
}
