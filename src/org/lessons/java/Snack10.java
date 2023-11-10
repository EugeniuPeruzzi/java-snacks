package org.lessons.java;

import java.util.Scanner;

public class Snack10 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        // input dei due numeri
        System.out.print("Inserisci il primo numero: " );
        int firstInput = in.nextInt();
        
        System.out.print("Inserisci il secondo numero: " );
        int secondInput = in.nextInt();
        
        // controllo quale e il piu grande
        int maxNum = Math.max(firstInput, secondInput);
        int minNum = Math.min(firstInput, secondInput);
        
        int sum = 0;
        for(int i=minNum; i<=maxNum; i++ ) {
        	
        	sum += i;
        }
        
        System.out.println(sum);
        in.close();
	}// stop main void 

}// stop class
