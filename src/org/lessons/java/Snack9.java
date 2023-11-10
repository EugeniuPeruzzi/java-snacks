package org.lessons.java;

public class Snack9 {

	public static void main(String[] args) {
		
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int sizeArray = array.length;
        int[] evenArray = new int[sizeArray];
        int[] oddArray = new int[sizeArray];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < sizeArray; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            } else {
                oddArray[oddCount] = array[i];
                oddCount++;
            }
        }
        
        // Stampa numeri pari
        System.out.print("Numeri pari: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.println();

        // Stampa numeri dispari
        System.out.print("Numeri dispari: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
		
		
		
		
		
		
		
	} // stop main void 

} // stop class
