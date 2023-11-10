package org.lessons.java;

import java.util.Scanner;

public class Snack6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        
        String input = in.nextLine().toLowerCase().replaceAll("\\s", "");

        char[] chars = input.toCharArray();

        int num = 0; 
  
        for (int i = 0; i < chars.length; i++) {
        	
        	// convert from ASCII vaues ex 0 --> 48, 1 -->49 ecc...
        	num = num * 10 + ((int) chars[i] - 48);
        	        	
        }//stop for
        System.out.println(num);
        
        in.close();
        
    }//stop function void
}// stop class
