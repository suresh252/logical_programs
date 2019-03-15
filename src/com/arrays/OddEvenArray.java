package com.arrays;

import java.util.Arrays;

public class OddEvenArray {

	public static void main(String[] args) {

		int array[] = { 8, 9, 1, 13, 6, 4, 5, 10 };
		System.out.println(array.length);

		Arrays.sort(array);
		System.out.print("Odd  numbers:");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 != 0) {

				System.out.print(array[i] + " ");
			}
		}

		System.out.println("");
		System.out.print("Even numbers:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
// Odd numbers:5 1 5 Even numbers:8 2 8 4 10
