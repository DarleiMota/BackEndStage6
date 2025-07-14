/*
8 - Crie um enum CodigoErro com valores de erros HTTP, como NOT_FOUND, BAD_REQUEST,
INTERNAL_SERVER_ERROR. Cada valor deve ter um código numérico e uma descrição
associados. Adicione métodos para acessar o código e a descrição. Dica: consulte
o site https://http.cat/ para conhecer os vários erros HTTP e conseguir
descrevê-los melhor.
 */
package com.darleimota.backendstage6.exercicios.exercicio1_8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CodigoErroApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do erro HTTP (ex: NOT_FOUND, BAD_REQUEST) ou 'sair' para encerrar: ");
            String entrada = scanner.nextLine().trim().toUpperCase();

            if (entrada.equals("SAIR")) break;

            try {
                CodigoErro erro = CodigoErro.valueOf(entrada);

                System.out.printf("Código: %d%n Descrição: %s%n", erro.getCodigo(), erro.getDescricao());
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("❌ Código de erro inválido! Tente novamente com: NOT_FOUND, BAD_REQUEST, etc.");
            }
        }
        scanner.close();
    }
}
