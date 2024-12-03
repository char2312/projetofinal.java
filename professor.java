package com.escola.model;

public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, int idade, String cpf, String disciplina) {
        super(nome, idade, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf() + ", Disciplina: " + disciplina);
    }
}

