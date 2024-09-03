package com.star;

public class C {

	public static void main(String[] args) {
		int rows = 7; // Number of rows

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
