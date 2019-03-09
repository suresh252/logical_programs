package com.arrays;

public class OddEvenArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int array[] = { 8, 5, 1, 2, 8, 4, 5, 10 };


		System.out.print("Odd numbers:");
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
