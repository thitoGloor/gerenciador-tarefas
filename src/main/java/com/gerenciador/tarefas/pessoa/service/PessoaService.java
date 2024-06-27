package com.gerenciador.tarefas.pessoa.service;

import com.gerenciador.tarefas.pessoa.dto.PessoaRequest;
import com.gerenciador.tarefas.pessoa.dto.PessoaResponse;
import com.gerenciador.tarefas.pessoa.model.Pessoa;
import com.gerenciador.tarefas.pessoa.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaResponse salvar(PessoaRequest request) {
        var pessoa = Pessoa.of(request);
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

    private Pessoa findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(null);
    }
}
