package com.star;

import java.util.Scanner;

public class K {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the number of rows from the user
	        System.out.print("Enter the number of rows: ");
	        int N = scanner.nextInt();

	        // Print the pattern
	        for (int i = 1; i <= N; i++) {
	            int value = i; // Start value for each row

	            for (int j = 1; j <= i; j++) {
	                System.out.print(value + " ");
	                value += 5; // Increment the value by 5
	            }

	            System.out.println(); // Move to the next line
	        }

	        scanner.close();
	    }
	}


