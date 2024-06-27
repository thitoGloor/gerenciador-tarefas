package com.gerenciador.tarefas.pessoa.dto;

import com.gerenciador.tarefas.departamento.model.Departamento;
import com.gerenciador.tarefas.tarefa.model.Tarefa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaRequest {

    private String nome;
    private Departamento departamento;
    private List<Tarefa> tarefas;

}
