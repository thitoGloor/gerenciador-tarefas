package com.gerenciador.tarefas.pessoa.predicate;

import com.gerenciador.tarefas.comum.predicate.PredicateBase;
import com.gerenciador.tarefas.pessoa.model.QPessoa;
import lombok.Builder;

import static com.gerenciador.tarefas.pessoa.model.QPessoa.pessoa;

public class PessoaPredicate extends PredicateBase {

    public PessoaPredicate comId(Integer id) {
        if (id != null) {
            builder.and(pessoa.id.eq(id));
        }
        return this;
    }
}
