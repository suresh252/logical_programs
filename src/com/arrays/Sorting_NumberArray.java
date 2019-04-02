package com.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class Sorting_NumberArray {

	public static void main(String[] args) {
		int[] array = { 9, 4, 1, 2, 5, 8 };
		int temp;

		LinkedList<Integer> list = new LinkedList<>();

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

	}

}
// Output [1, 2, 4, 5, 8, 9]
