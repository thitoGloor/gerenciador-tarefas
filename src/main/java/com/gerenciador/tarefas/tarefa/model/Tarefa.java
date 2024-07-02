package com.gerenciador.tarefas.tarefa.model;

import com.gerenciador.tarefas.departamento.model.Departamento;
import com.gerenciador.tarefas.pessoa.model.Pessoa;
import com.gerenciador.tarefas.tarefa.dto.TarefaRequest;
import com.gerenciador.tarefas.tarefa.enums.ESituacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TAREFA")
public class Tarefa {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "PRAZO")
    private LocalDateTime prazo;

    @ManyToOne
    private Departamento departamento;

    @Column(name = "DURACAO")
    private LocalTime duracao;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa pessoa;

    @Column(name = "SITUACAO")
    private ESituacao situacao;

    public static Tarefa of(TarefaRequest request) {
        return Tarefa
                .builder()
                .titulo(request.getTitulo())
                .descricao(request.getDescricao())
                .prazo(request.getPrazo())
                .duracao(request.getDuracao())
                .build();
    }
}
