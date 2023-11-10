package org.lessons.java;

import java.util.Scanner;

public class Snack8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");

        String input = in.nextLine().toLowerCase();

        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char carattere = chars[i];

            if (carattere == 'a') {
                chars[i] = 'o';
            } else if (carattere == 'o') {
                chars[i] = 'a';
            }
        }

        // Converti l'array di caratteri in una stringa
        String risultato = new String(chars);

        // Stampa la nuova stringa
        System.out.println("Parola invertita: " + risultato);

        in.close();
    }
}
