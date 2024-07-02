package com.gerenciador.tarefas.tarefa.repository;

import com.gerenciador.tarefas.tarefa.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
}
