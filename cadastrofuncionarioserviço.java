package com.escola.servico;

import com.escola.model.Funcionario;
import com.escola.model.TipoFuncionario;
import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarioServico implements CadastroFuncionario {
    private List<Funcionario> funcionarios;

    public CadastroFuncionarioServico() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    @Override
    public void listarFuncionarios(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
        }
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
