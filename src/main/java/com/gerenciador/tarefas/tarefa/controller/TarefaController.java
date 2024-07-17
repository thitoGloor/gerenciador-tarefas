package com.gerenciador.tarefas.tarefa.controller;

import com.gerenciador.tarefas.tarefa.dto.TarefaRequest;
import com.gerenciador.tarefas.tarefa.dto.TarefaResponse;
import com.gerenciador.tarefas.tarefa.service.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/tarefa")
public class TarefaController {

    private final TarefaService service;

    @PostMapping
    public TarefaResponse salvar(@RequestBody TarefaRequest request) {
        return service.salvar(request);
    }

    @PutMapping("alocar/{id}")
    public void alocarPessoa(@PathVariable Integer id) {
//        service
    }

}
