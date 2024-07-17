package com.gerenciador.tarefas.pessoa.dto;

import com.gerenciador.tarefas.pessoa.predicate.PessoaPredicate;
import lombok.Data;

@Data
public class PessoaFiltros {

    private Integer id;
    private String nome;
    private Integer departamentoId;
    private Integer tarefaId;

    public PessoaPredicate toPredicate() {
        return new PessoaPredicate()
                .comId(id);
    }
}
