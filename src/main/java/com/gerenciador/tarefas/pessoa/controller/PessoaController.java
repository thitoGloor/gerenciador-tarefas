package com.gerenciador.tarefas.pessoa.controller;

import com.gerenciador.tarefas.pessoa.dto.PessoaRequest;
import com.gerenciador.tarefas.pessoa.dto.PessoaResponse;
import com.gerenciador.tarefas.pessoa.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/pessoa")
public class PessoaController {

    private final PessoaService service;

    @PostMapping
    public PessoaResponse salvar(@RequestBody PessoaRequest request) {
        return service.salvar(request);
    }

    @PutMapping("/{id}/editar")
    public PessoaResponse editar(@PathVariable Integer id,
                                 @RequestBody PessoaRequest request) {
        return service.editar(id, request);
    }

    @DeleteMapping("/{id}/deletar")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }

    @GetMapping
    public void findAll() {
        //retornar nome, depto, hrs gasta nas tarefas
    }

    @GetMapping("/gastos")
    public void getMediaByNomePessoa() {
        // retornar media de horas gastas por tarefa
    }
}
