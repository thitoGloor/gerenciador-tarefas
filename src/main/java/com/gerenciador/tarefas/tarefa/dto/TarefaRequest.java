package com.gerenciador.tarefas.tarefa.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class TarefaRequest {

    private String titulo;
    private String descricao;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate prazo;
    private Double duracao;
    private Integer departamentoId;
}
