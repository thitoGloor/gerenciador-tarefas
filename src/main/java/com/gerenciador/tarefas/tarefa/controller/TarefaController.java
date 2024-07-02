package com.gerenciador.tarefas.tarefa.controller;

import com.gerenciador.tarefas.tarefa.dto.TarefaRequest;
import com.gerenciador.tarefas.tarefa.dto.TarefaResponse;
import com.gerenciador.tarefas.tarefa.service.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/tarefa")
public class TarefaController {

    private final TarefaService service;

    @PostMapping
    public TarefaResponse salvar(@RequestBody TarefaRequest request) {
        return service.salvar(request);
    }

}
