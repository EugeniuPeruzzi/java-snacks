package org.lessons.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		final int INVITATION = 10;
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		Random rnd = new Random();
		
		for (int i=0; i < INVITATION; i++) {
			
			String randomNames = nomi[rnd.nextInt(nomi.length)];
			String randomSurnames = cognomi[rnd.nextInt(cognomi.length)];
			System.out.println(randomNames + " " +randomSurnames);
		}
		

	}

}
