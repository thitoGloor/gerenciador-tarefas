package com.gerenciador.tarefas.pessoa.repository;

import com.gerenciador.tarefas.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer >, QuerydslPredicateExecutor<Pessoa> {

}
