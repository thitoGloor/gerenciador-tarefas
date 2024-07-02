package com.gerenciador.tarefas.departamento.controller;

import com.gerenciador.tarefas.departamento.dto.DepartamentoRequest;
import com.gerenciador.tarefas.departamento.dto.DepartamentoResponse;
import com.gerenciador.tarefas.departamento.service.DepartamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/departamento")
public class DepartamentoController {

    private final DepartamentoService service;

    @PostMapping
    public DepartamentoResponse salvar(@RequestBody DepartamentoRequest request) {
        return service.salvar(request);
    }
}
