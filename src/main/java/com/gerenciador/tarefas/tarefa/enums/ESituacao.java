package com.gerenciador.tarefas.tarefa.enums;

public enum ESituacao {

    FINALIZADO("Finalizado"),
    NAO_FINALIZADO("Não Finalizado");

    private final String descricao;

    ESituacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
