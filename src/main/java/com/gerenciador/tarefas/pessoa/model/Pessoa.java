package com.gerenciador.tarefas.pessoa.model;

import com.gerenciador.tarefas.departamento.model.Departamento;
import com.gerenciador.tarefas.pessoa.dto.PessoaRequest;
import com.gerenciador.tarefas.tarefa.model.Tarefa;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PESSOA")
public class Pessoa {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @ManyToOne
    private Departamento departamento;

    @OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY)
    private List<Tarefa> tarefas;

    public static Pessoa of(PessoaRequest request) {
        return Pessoa
                .builder()
                .nome(request.getNome())
                .tarefas(request.getTarefas())
                .departamento(request.getDepartamento())
                .build();
    }

    public Pessoa update(PessoaRequest request) {
        return Pessoa
                .builder()
                .nome(request.getNome())
                .tarefas(request.getTarefas())
                .departamento(request.getDepartamento())
                .build();
    }
}
