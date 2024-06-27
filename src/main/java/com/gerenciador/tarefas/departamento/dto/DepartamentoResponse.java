package com.gerenciador.tarefas.departamento.dto;

import com.gerenciador.tarefas.departamento.model.Departamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoResponse {

    private Integer id;
    private String descricao;

    public static DepartamentoResponse of(Departamento departamento) {
        return DepartamentoResponse
                .builder()
                .id(departamento.getId())
                .descricao(departamento.getDescricao())
                .build();
    }
}
