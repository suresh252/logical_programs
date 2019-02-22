package com.logical;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;
		int n = 8;
		System.out.println("enter number upto which fibonacci series to print: " + n);
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < n; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);

		}

	}
}
