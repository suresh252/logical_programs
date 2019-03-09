package com.arrays;

import java.util.Arrays;

public class Sorting_Numbers {

	public static void main(String[] args) {
		int[] array = { 9, 4, 1, 2, 5, 8 };
		int temp;
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(array));

		String str = "venu";
		String str1 = "venu";
		System.out.println(str == str1);
	}

}
