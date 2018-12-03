package com.logical;

public class ArithmeticSeries {
	static int n = 15;
	static int d = 3;
	static int a = 2;

	public static void main(String[] args) {
		for (int i = 1; i <= n; i++) {
			System.out.print(" " + a);
			a = a + d;
		}


	}
}
