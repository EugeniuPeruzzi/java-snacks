package org.lessons.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Inserisci un numero: ");

        
        int input = in.nextInt();
        
        int ore = input / 3600;
        int minuti = (input % 3600) / 60;
        int secondi = input % 60;
        
        String formatoOre = (ore < 10) ? "0" + ore : String.valueOf(ore);
        String formatoMinuti = (minuti < 10) ? "0" + minuti : String.valueOf(minuti);
        String formatoSecondi = (secondi < 10) ? "0" + secondi : String.valueOf(secondi);
        
        System.out.println(formatoOre + ":" + formatoMinuti + ":" + formatoSecondi);

        in.close();

	}//stop function void

}// stop class
