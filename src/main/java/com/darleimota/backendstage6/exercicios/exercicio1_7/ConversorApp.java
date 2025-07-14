/*
7 - Crie um enum Moeda com valores como DOLAR, EURO, REAL. Cada moeda deve ter uma taxa de
conversão para reais. Adicione um método que recebe um valor em reais e retorna o
valor convertido para a moeda.
 */

package com.darleimota.backendstage6.exercicios.exercicio1_7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class ConversorApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // limpar o buffer do Scanner

        System.out.print("Digite a moeda desejada (REAL, DOLAR, EURO): ");
        String entrada = scanner.nextLine().trim().toUpperCase();

        try {
            Moeda moeda = Moeda.valueOf(entrada);
            double convertido = moeda.converterPara(valor);

            System.out.printf("%.2f reais em %s = %.2f %n", valor, entrada, convertido);

        } catch (IllegalArgumentException e) {
            System.out.println("Moeda inválida! Use: REAL, DOLAR ou EURO.");
        }

        scanner.close();
    }

}
