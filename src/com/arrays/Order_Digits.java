package com.arrays;

public class Order_Digits {

	public static void main(String[] args) {

		int[] array = { 3, 0, 2, 0, 1, 2, 0 };

		for (int i = 0; i <= array.length - 1; i++) {

			if (array[i] != 0) {
				System.out.print(array[i]);
			}
		}
		for (int j = 0; j <= array.length - 1; j++) {
			if (array[j] == 0) {
				System.out.print(array[j]);
			}
		}

	}
}
