package com.gerenciador.tarefas.departamento.controller;

import com.gerenciador.tarefas.departamento.dto.DepartamentoRequest;
import com.gerenciador.tarefas.departamento.dto.DepartamentoResponse;
import com.gerenciador.tarefas.departamento.service.DepartamentoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/departamento")
public class DepartamentoController {

    private static DepartamentoService service;

    @PostMapping
    public DepartamentoResponse salvar(@RequestBody DepartamentoRequest request) {
        return service.salvar(request);
    }
}
