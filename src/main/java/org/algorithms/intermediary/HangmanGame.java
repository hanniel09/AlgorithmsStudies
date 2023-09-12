package org.algorithms.intermediary;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraOculta = "elefante";
        int maxTentativas = 6;

        char[] palavraAdivinhada = new char[palavraOculta.length()];
        for (int i = 0; i < palavraAdivinhada.length; i++) {
            palavraAdivinhada[i] = '_';
        }

        int tentativas = 0;
        boolean palavraAdivinhadaCompleta = false;

        while (tentativas < maxTentativas && !palavraAdivinhadaCompleta) {
            System.out.println("\nPalavra: " + String.valueOf(palavraAdivinhada));
            System.out.println("Tentativas restantes: " + (maxTentativas - tentativas));
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0; i < palavraOculta.length(); i++) {
                if (palavraOculta.charAt(i) == letra) {
                    palavraAdivinhada[i] = letra;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                tentativas++;
                System.out.println("Letra não encontrada. Tente novamente.");
            }

            palavraAdivinhadaCompleta = String.valueOf(palavraAdivinhada).equals(palavraOculta);
        }

        if (palavraAdivinhadaCompleta) {
            System.out.println("\nParabéns! Você adivinhou a palavra corretamente: " + palavraOculta);
        } else {
            System.out.println("\nVocê perdeu! A palavra correta era: " + palavraOculta);
        }

        scanner.close();
    }
}
