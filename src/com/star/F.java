package com.star;

public class F {

	    public static void main(String[] args) {
	        int n = 5; // You can adjust this value to change the size of the pattern

	        // Print the upper half of the pattern
	        for (int i = n; i >= 1; i--) {
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	        // Print the lower half of the pattern
	        for (int i = 2; i <= n; i++) {
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	}
