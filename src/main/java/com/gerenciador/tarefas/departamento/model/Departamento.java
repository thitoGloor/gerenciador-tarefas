package com.gerenciador.tarefas.departamento.model;

import com.gerenciador.tarefas.departamento.dto.DepartamentoRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DEPARTAMENTO")
public class Departamento {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;

    public static Departamento of(DepartamentoRequest request) {
        return Departamento
                .builder()
                .descricao(request.getDescricao())
                .build();
    }
}


