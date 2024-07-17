package com.gerenciador.tarefas.pessoa.dto;

import com.gerenciador.tarefas.pessoa.model.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaResponse {

    private Integer id;
    private String nome;
    private String departamento;

    public static PessoaResponse of(Pessoa pessoa) {
        return PessoaResponse
                .builder()
                .id(pessoa.getId())
                .nome(pessoa.getNome())
                .departamento(pessoa.getDepartamento() != null
                        ? pessoa.getDepartamento().getDescricao()
                        : null)
                .build();
    }

    public static List<PessoaResponse> convertFrom(List<Pessoa> pessoas) {
        return pessoas
                .stream()
                .map(PessoaResponse::of)
                .toList();
    }

}
