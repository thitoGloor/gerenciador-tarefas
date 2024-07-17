package com.gerenciador.tarefas.tarefa.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gerenciador.tarefas.tarefa.enums.ESituacao;
import com.gerenciador.tarefas.tarefa.model.Tarefa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TarefaResponse {

    private Integer id;
    private String titulo;
    private String descricao;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate prazo;
    private String departamentoDescricao;
    private Double duracao;
    private String pessoaNome;
    private ESituacao situacao;

    public static TarefaResponse of(Tarefa tarefa) {
        return TarefaResponse
                .builder()
                .titulo(tarefa.getTitulo())
                .descricao(tarefa.getDescricao())
                .prazo(tarefa.getPrazo())
                .departamentoDescricao(tarefa.getDepartamento().getDescricao())
                .duracao(tarefa.getDuracao())
                .pessoaNome(tarefa.getPessoa().getNome())
                .situacao(tarefa.getSituacao())
                .build();
    }
}
