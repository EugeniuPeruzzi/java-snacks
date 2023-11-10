package org.lessons.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int characters = 0;
		int numbers = 0;
		int symbols = 0;
		
		boolean flag = true;
		
		while (flag) {
			System.out.print("Inserisci un qualcosa (0 termina l'operazione): ");
			
			// store input user
			String input = in.nextLine().toLowerCase().replaceAll("\\s", "");
			
            if (input.equals("0")) {
                flag = false;
                System.out.println("Operazione terminata");
                continue;
            }
			
			// make it an array
			char[] array = input.toCharArray();
			
			for (int i=0; i<array.length; i++) {
				
				char caratteri = array[i];
				
				if (Character.isLetter(caratteri)) {
					characters ++;
				}
				else if (Character.isDigit(caratteri)) {
					numbers ++;
				}
				else {
					symbols ++;
				}
				
				
			}
			// System.out.println(array.getClass().getSimpleName());

			System.out.println("Numero delle lettere: " + characters);
			System.out.println("Numero delle cifre: "+ numbers);
			System.out.println("Numero delle simboli: "+ symbols + "\n");
			
			characters = 0;
			numbers = 0;
			symbols = 0;
			
			in.close();
		}

		
		
		
		
		

	}

}
