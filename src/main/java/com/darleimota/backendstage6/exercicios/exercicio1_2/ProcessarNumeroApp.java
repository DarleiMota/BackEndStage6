/*
2 - Implemente um método que recebe um número inteiro dentro de um Optional.
Se o número estiver presente e for positivo, calcule seu quadrado.
Caso contrário, retorne Optional.empty.
 */

package com.darleimota.backendstage6.exercicios.exercicio1_2;

import org.springframework.boot.CommandLineRunner;

import java.util.Optional;

//@Component
public class ProcessarNumeroApp implements CommandLineRunner {

    public static Optional<Integer> processaNumero(Optional<Integer> numero) {

        // Usando FlatMap porque estamos já trabalhando com Optional, e para fazer em uma linha só
        // fazendo um if/else lambda pra comparar.
        return numero.flatMap(n -> n > 0 ? Optional.of(n * n) :Optional.empty());
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\nSe = numero então: numero * numero, senão: empty(Vazio)");
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty
    }
}
