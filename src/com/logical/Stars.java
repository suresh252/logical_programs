package com.logical;

public class Stars {
	static int n = 5;

	public static void main(String[] args) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");

			}
			System.out.println(" * ");
		}
	}
}
