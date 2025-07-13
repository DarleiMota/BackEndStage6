/*
4 - Implemente um método que verifica se uma frase é um palíndromo. Um palíndromo é uma palavra/frase que,
quando lida de trás pra frente, é igual à leitura normal. Um exemplo:
 */
package com.darleimota.backendstage6.exercicios.exercicio1_4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.Normalizer;
import java.util.Scanner;

//@Component
public class VerificarPalindromoApp implements CommandLineRunner {

    public static boolean ehPalindromo(String palavra) {
        if (palavra == null || palavra.trim().isEmpty()) {
            return false;
        }
        // remove assentos
        String texto = Normalizer.normalize(palavra, Normalizer.Form.NFD);
        // remove tudo que não for letra
        texto = texto.replaceAll("[^\\p{IsAlphabetic}]", "")
                .toLowerCase(); // tudo minusculo
        return new StringBuilder(texto)
                .reverse()
                .toString()
                .equals(texto); // aqui compara com o texto de antes e retorna True or False
    }
    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou texto para saber se é palindromo");
        String palindromo = scanner.nextLine();
        // Feito if else com um operador ternario dentro do println
        System.out.println(ehPalindromo(palindromo)? "É um palíndromo!" : "Não é um palíndromo.");
    }
}
