package com.darleimota.backendstage6.exercicios.exercicio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ConversaoNumeros implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> numerosValidos = input.stream()
                .filter(n -> n.matches("\\d+")) // Esse matches filtra os inteiros positivos
                .map(Integer::parseInt) // Converte o que conseguiu de números em inteiros
                .toList(); // Coleta para uma lista
        System.out.println("\n==== SEPARAÇÃO E CONVERSÃO EM NÚMEROS INTEIROS ====");
        System.out.println("Lista a ser filtrada: " + input);
        System.out.println("Nova lista separada" + numerosValidos);
    }
}
