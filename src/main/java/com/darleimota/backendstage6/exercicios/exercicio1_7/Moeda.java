package com.darleimota.backendstage6.exercicios.exercicio1_7;

public enum Moeda {
    REAL(1.0),
    DOLAR(0.196),
    EURO(0.1818);

    private final double taxaConversao;

    Moeda(double taxaConversao) {
        this.taxaConversao = taxaConversao;
    }

    public double converterPara(double valorEmReais) {
        return valorEmReais * taxaConversao;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }
}
