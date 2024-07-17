package com.gerenciador.tarefas.pessoa.service;

import com.gerenciador.tarefas.comum.exception.NotFoundException;
import com.gerenciador.tarefas.departamento.service.DepartamentoService;
import com.gerenciador.tarefas.pessoa.dto.PessoaFiltros;
import com.gerenciador.tarefas.pessoa.dto.PessoaRequest;
import com.gerenciador.tarefas.pessoa.dto.PessoaResponse;
import com.gerenciador.tarefas.pessoa.model.Pessoa;
import com.gerenciador.tarefas.pessoa.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;
    private final DepartamentoService departamentoService;

    public PessoaResponse salvar(PessoaRequest request) {
        var pessoa = Pessoa.of(request);

        if (request.getDepartamentoId() != null) {
            var departamento = departamentoService.findById(request.getDepartamentoId());
            pessoa.setDepartamento(departamento);
        }
        repository.save(pessoa);

        return PessoaResponse.of(pessoa);
    }

    public PessoaResponse editar(Integer id, PessoaRequest request) {
        var pessoa = findById(id);
        repository.save(pessoa.update(request));

        return PessoaResponse.of(pessoa);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public List<PessoaResponse> findAll() {
        var pessoas = repository.findAll();
        return PessoaResponse.convertFrom(pessoas);
    }

    public Page<PessoaResponse> findAllTwo(PessoaFiltros filtros, Pageable pageable) {
        var predicate = filtros.toPredicate().build();
        var pessoas = repository.findAll(predicate, pageable);
        return pessoas.map(PessoaResponse::of);
    }

    private Pessoa findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Pessoa nâo encontrada."));
    }

    private void validarDepartamento(Integer id) {
        var departamento = departamentoService.findById(id);
    }
}
