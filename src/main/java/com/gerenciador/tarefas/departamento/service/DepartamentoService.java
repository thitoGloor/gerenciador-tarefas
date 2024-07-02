package com.gerenciador.tarefas.departamento.service;

import com.gerenciador.tarefas.comum.exception.NotFoundException;
import com.gerenciador.tarefas.departamento.dto.DepartamentoRequest;
import com.gerenciador.tarefas.departamento.dto.DepartamentoResponse;
import com.gerenciador.tarefas.departamento.model.Departamento;
import com.gerenciador.tarefas.departamento.repository.DepartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoResponse salvar(DepartamentoRequest request) {
        var departamento = Departamento.of(request);
        repository.save(departamento);
        return DepartamentoResponse.of(departamento);
    }

    public Departamento findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Departamento nâo encontrado."));
    }
}
