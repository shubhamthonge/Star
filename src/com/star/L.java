package com.star;

public class L {
	public static void main(String[] args) {
        int N = 5; // Number of rows for the top half

        // Print the pattern
        for (int i = 1; i <= 2 * N - 1; i++) {
            int n = i <= N ? i : 2 * N - i;
            for (int j = 0; j < N - n; j++) System.out.print("  ");
            for (int j = 1; j <= n; j++) System.out.print(j + " ");
           for (int j = n - 1; j >= 1; j--) System.out.print(j + " ");
            System.out.println();}}}
