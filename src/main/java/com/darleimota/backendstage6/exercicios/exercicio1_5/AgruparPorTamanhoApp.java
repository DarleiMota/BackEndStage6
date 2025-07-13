/*
5 - Implemente um método que recebe uma lista de e-mails (String) e retorna
uma nova lista onde cada e-mail está convertido para letras minúsculas.
 */

package com.darleimota.backendstage6.exercicios.exercicio1_5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//@Component
public class AgruparPorTamanhoApp implements CommandLineRunner {

    public static Map<Integer, List<String>> agruparPorTamanho(List<String> palavras) {
        // Separar por grupo de tamanho da string.
        return palavras.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        List<String> palavras = new ArrayList<>();

        System.out.println("==== Sabendo o tamanho das palavras ====");
        System.out.println("Digite palavras ou digite ( fim ) para encerrar):");

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")){
             break;
            }else {
                palavras.add(entrada);
            }
        }

        Map<Integer, List<String>> agrupadas = agruparPorTamanho(palavras);
        agrupadas.forEach((tamanho, lista) ->
                System.out.println("Tamanho " + tamanho + ": " + lista));
    }
}
