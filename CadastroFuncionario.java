package com.escola.servico;

import com.escola.model.Funcionario;
import java.util.List;

public interface CadastroFuncionario {
    void adicionarFuncionario(Funcionario funcionario);
    void listarFuncionarios(List<Funcionario> funcionarios);
}
