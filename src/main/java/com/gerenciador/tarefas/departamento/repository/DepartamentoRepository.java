package com.gerenciador.tarefas.departamento.repository;

import com.gerenciador.tarefas.departamento.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
