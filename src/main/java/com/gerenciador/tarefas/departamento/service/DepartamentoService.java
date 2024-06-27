package com.gerenciador.tarefas.departamento.service;

import com.gerenciador.tarefas.departamento.dto.DepartamentoRequest;
import com.gerenciador.tarefas.departamento.dto.DepartamentoResponse;
import com.gerenciador.tarefas.departamento.model.Departamento;
import com.gerenciador.tarefas.departamento.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {

    private static DepartamentoRepository repository;

    public DepartamentoResponse salvar(DepartamentoRequest request) {
        var departamento = Departamento.of(request);
        repository.save(departamento);
        return DepartamentoResponse.of(departamento);
    }
}
