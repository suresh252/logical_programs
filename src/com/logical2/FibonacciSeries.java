package com.logical2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, n = 10;
		System.out.print(n1 + " " + n2);

		// case 1: using for loop
		for (int i = 2; i < n; ++i) {

			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

		
	}

}
