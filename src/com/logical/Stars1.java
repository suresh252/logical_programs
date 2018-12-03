package com.logical;

public class Stars1 {
	static int n = 5;

	public static void main(String[] args) {
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}
	}
}
