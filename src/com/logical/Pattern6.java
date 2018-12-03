package com.logical;

public class Pattern6 {
	
	static int n=5;
	public static void main(String[] args) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

}
