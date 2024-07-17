package com.gerenciador.tarefas.pessoa.controller;

import com.gerenciador.tarefas.pessoa.dto.PessoaFiltros;
import com.gerenciador.tarefas.pessoa.dto.PessoaRequest;
import com.gerenciador.tarefas.pessoa.dto.PessoaResponse;
import com.gerenciador.tarefas.pessoa.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<PessoaResponse> findAll() {
        return service.findAll();
    }

    @GetMapping("page")
    public Page<PessoaResponse> findAllTwo(PessoaFiltros filtros, Pageable pageable) {
        return service.findAllTwo(filtros, pageable);
    }

    @GetMapping("/gastos")
    public void getMediaByNomePessoa() {
        // retornar media de horas gastas por tarefa
    }
}
