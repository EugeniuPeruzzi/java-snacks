package org.lessons.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		System.out.print("Inserisci un numero");
		//call out scanner
		Scanner in = new Scanner(System.in);
		int inputNumber = in.nextInt();
		
		if (inputNumber %2 != 0) {
			inputNumber ++;
			System.out.println(inputNumber);
		}
		else {
			System.out.println(inputNumber);
		}
		//colse
		in.close();

	}

}
