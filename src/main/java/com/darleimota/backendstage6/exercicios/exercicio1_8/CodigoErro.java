package com.darleimota.backendstage6.exercicios.exercicio1_8;

public enum CodigoErro {

    BAD_REQUEST(400, "Requisição inválida"),
    UNAUTHORIZED(401, "Não autorizado"),
    FORBIDDEN(403, "Acesso proibido"),
    NOT_FOUND(404, "Recurso não encontrado"),
    INTERNAL_SERVER_ERROR(500, "Erro interno do servidor");

    private final int codigo;
    private final String descricao;

    CodigoErro(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}