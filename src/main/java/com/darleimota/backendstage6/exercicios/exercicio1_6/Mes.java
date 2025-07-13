package com.darleimota.backendstage6.exercicios.exercicio1_6;

public enum Mes {
    JANEIRO(31),
    FEVEREIRO(28),
    MARCO(31),
    ABRIl(30),
    MAIO(31),
    JUNHO(30),
    JULHO(31),
    AGOSTO(31),
    SETEMBRO(30),
    OUTUBRO(31),
    NOVEMBRO(30),
    DEZEMBRO(31);

    private final int dias;

    Mes(int dias) {
        this.dias = dias;
    }

    public int getNumeroDias() {
        return dias;
    }
}
