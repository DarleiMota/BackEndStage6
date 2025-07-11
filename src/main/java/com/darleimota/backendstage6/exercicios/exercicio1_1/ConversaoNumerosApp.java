/*
1 - Imagine que você tem uma lista de strings. Algumas das strings são números,
mas outras não. Queremos converter a lista de strings para uma lista de números.
Se a conversão falhar, você deve ignorar o valor.
 */

package com.darleimota.backendstage6.exercicios.exercicio1_1;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.List;

//@Component
public class ConversaoNumerosApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<String> input = Arrays.asList("1", "abc", "20", "30x");

        // Resposta feita atraves de pesquisas de melhor solução
        List<Integer> numerosValidos = input.stream()
                .filter(n -> n.matches("\\d+")) // Esse matches filtra os inteiros positivos
                .map(Integer::parseInt) // Converte o que conseguiu de números em inteiros
                .toList(); // Coleta para uma lista, não tiver a lista fica vazia.

        // * Respotas aprendida em Aula, try, catch
//        List<Integer> numerosValidos = input.stream()
//                .map(str -> {
//                    try {
//                        return Optional.of(Integer.parseInt(str));
//                    } catch (NumberFormatException e) {
//                        return Optional.<Integer>empty(); }
//                })
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .toList();

        System.out.println("\n==== SEPARAÇÃO E CONVERSÃO EM NÚMEROS INTEIROS ====");
        System.out.println("Lista a ser filtrada: " + input);
        System.out.println("Nova lista separada: " + numerosValidos);
    }
}
