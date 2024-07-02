package com.gerenciador.tarefas.tarefa.service;

import com.gerenciador.tarefas.departamento.service.DepartamentoService;
import com.gerenciador.tarefas.tarefa.dto.TarefaRequest;
import com.gerenciador.tarefas.tarefa.dto.TarefaResponse;
import com.gerenciador.tarefas.tarefa.model.Tarefa;
import com.gerenciador.tarefas.tarefa.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefaRepository repository;
    private final DepartamentoService departamentoService;

    public TarefaResponse salvar(TarefaRequest request) {
        var tarefa = Tarefa.of(request);
        var departamento = departamentoService.findById(request.getDepartamentoId());
        if (departamento != null) {
            tarefa.setDepartamento(departamento);
        }
        repository.save(tarefa);
        return TarefaResponse.of(tarefa);
    }
}
