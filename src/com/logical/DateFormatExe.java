package com.logical;

public class DateFormatExe {

	public static void main(String[] args) {
		int[] array = { 5, 0, 2, 0, 4, 3, 12, 1 };

		System.out.println("Even numbers");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		System.out.println("odd numbers");

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}

	}
}
// System.out.println(Arrays.toString(array));
