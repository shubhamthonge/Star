package com.star;

public class A {

	public static void main(String[] args) {
		int start = 7; // Starting number for the pattern

		for (int i = start; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println(); // Move to the next line after each row

		}
	}
}
