package com.escola.model;

public class Secretario extends Funcionario {
    private String setor;

    public Secretario(String nome, int idade, String cpf, String setor) {
        super(nome, idade, cpf);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirDados() {
        System.out.println("Secretário: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf() + ", Setor: " + setor);
    }
}
