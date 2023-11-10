package org.lessons.java;

import java.util.Random;

public class Snack11 {

    public static void main(String[] args) {
        final int NUM_VALUES = 10;

        Random randomGenerator = new Random(100);

        // Genera un array con 10 elementi casuali compresi tra 0 e 100
        int[] valuesArray = new int[NUM_VALUES];
        for (int index = 0; index < valuesArray.length; index++) {
            valuesArray[index] = randomGenerator.nextInt(101);
            System.out.println("valuesArray[" + index + "]: " + valuesArray[index]);
        }

        // Trova il valore massimo
        int maxValue = Integer.MIN_VALUE;
        for (int index = 0; index < valuesArray.length; index++) {
            int value = valuesArray[index];
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // Trova il valore minimo
        int minValue = Integer.MAX_VALUE;
        for (int index = 0; index < valuesArray.length; index++) {
            int value = valuesArray[index];
            if (value < minValue) {
                minValue = value;
            }
        }

        // Trova il valore medio
        int averageValue = 0;
        for (int index = 0; index < valuesArray.length; index++) {
            int value = valuesArray[index];
            averageValue += value;
        }
        averageValue /= valuesArray.length;

        // Stampa i risultati
        System.out.println("maxValue: " + maxValue);
        System.out.println("minValue: " + minValue);
        System.out.println("averageValue: " + averageValue);
    }
}
