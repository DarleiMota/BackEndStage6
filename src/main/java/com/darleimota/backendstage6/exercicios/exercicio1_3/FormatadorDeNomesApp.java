package com.darleimota.backendstage6.exercicios.exercicio1_3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FormatadorDeNomesApp implements CommandLineRunner {

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {

        String[] nome = nomeCompleto.trim().split("\\s+");
        if (nome.length == 0) return ""; // vazio
        if (nome.length == 1) return nome[0]; // com um nome
        return nome[0] + " " + nome[nome.length - 1]; // com primeiro e ultimo nome
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("== Formatando nomes === ");
        System.out.println(" 1 - Joao Carlos Silva"+ "\n"+"2 - Maria \n");

        System.out.println("Resultado");
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

    }
}
