package com.escola.model;

public class Diretor extends Funcionario {
    private int anoInicio;

    public Diretor(String nome, int idade, String cpf, int anoInicio) {
        super(nome, idade, cpf);
        this.anoInicio = anoInicio;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    @Override
    public void exibirDados() {
        System.out.println("Diretor: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf() + ", Ano de Início: " + anoInicio);
    }
}
