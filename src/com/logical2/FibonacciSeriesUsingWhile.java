package com.logical2;

public class FibonacciSeriesUsingWhile {

	public static void main(String[] args) {
		// case 2: using while loop
		int n1 = 0, n2 = 1, n = 15;
		int n3 = n1 + n2;
		System.out.print(+n1);
		while (n3 < n) {
			System.out.print(" " + n3);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

}
