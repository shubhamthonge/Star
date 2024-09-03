package com.star;

public class H {
	    public static void main(String[] args) {
	        int N = 8; // Number of rows

	        // Print the pattern
	        for (int i = 1; i <= N; i++) {
	            int start = i; // Start value for each row

	            for (int j = 0; j < i; j++) {
	                System.out.print((start + j) + " ");
	            }

	            System.out.println(); // Move to the next line
	        }
	    }
	}


