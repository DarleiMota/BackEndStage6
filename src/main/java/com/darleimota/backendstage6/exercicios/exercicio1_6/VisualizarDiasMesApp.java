/*
6 - Crie um enum Mes que represente os meses do ano. Adicione um método que
retorna o número de dias de cada mês, considerando anos não bissextos.
 */

package com.darleimota.backendstage6.exercicios.exercicio1_6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class VisualizarDiasMesApp implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean opcao;
        do {
            opcao = false;
            System.out.println("\n=== Quantos dias tem o mês ===");
            System.out.print("Digite o nome do mês (ex: Janeiro, Fevereiro...): ");
            String entrada = scanner.nextLine().trim().toUpperCase();

            try {
                Mes mes = Mes.valueOf(entrada); // Retorna o que tiver no enum
                // Fazer a entrada pelo que o usuario digitar
                String nomeFormatado = entrada
                        .substring(0, 1)  // Pega a primeira letra
                        + entrada
                        .substring(1) // Pega as demais
                        .toLowerCase(); // Deixa tudo maiúsculo

                System.out.println("Quantidade de dias do mês de " + nomeFormatado + ": " + mes.getNumeroDias());


            } catch (IllegalArgumentException e) {
                System.out.println("Mês inválido! Tente novamente.");
                opcao = true; // Faz até digitar certo
            }
        } while (opcao);
    }
}
