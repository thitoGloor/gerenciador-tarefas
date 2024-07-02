package com.gerenciador.tarefas.tarefa.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private LocalDateTime prazo;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime duracao;
    private Integer departamentoId;
}
