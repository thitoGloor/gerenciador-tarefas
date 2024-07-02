package com.gerenciador.tarefas.pessoa.dto;

import com.gerenciador.tarefas.departamento.model.Departamento;
import com.gerenciador.tarefas.tarefa.model.Tarefa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaRequest {

    private String nome;
    private Integer departamentoId;
}
