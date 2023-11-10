package org.lessons.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Scrivi una parola: ");
		
		// take user input make it lower case remove spaces so ca use more than a word like : i topi non avevano nipoti 
		String userInput = in.nextLine().toLowerCase().replaceAll("\\s", "");
		
		// inserting userInput (string) to a char array
		char[] array = userInput.toCharArray();
		boolean flag = true;
		
		// dividing array in half and verify if matches
		for (int i=0; i<array.length/2; i++) {
			char firstHalf = array[i];
			char secondHalf = array[array.length -1 -i]; 
			
			if (firstHalf != secondHalf) {
                flag = false;
                break; 
            }
        }

        if (flag) {
            System.out.println("La parola è palindroma.");
        } 
        else {
            System.out.println("La parola non è palindroma.");
        }

			

		
		in.close();
	}

}
