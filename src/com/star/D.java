package com.star;

public class D {

	    public static void main(String[] args) {
	        int start = 9; // Starting number for the pattern
	        
	        for (int i = start; i >= 1; i--) {
	            for (int j = start; j >= start - i + 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}


