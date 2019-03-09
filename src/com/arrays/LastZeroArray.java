package com.arrays;

import java.util.Arrays;

public class LastZeroArray {

	public static void main(String[] args) {
		int[] array = { 12, 0, 3, 0, 8, 0, 3 };

		int count = 0;
		
		System.out.println("Actual array is: "+Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[count] = array[i];
				count++;
			}
		}
		while (count < array.length) {
			array[count] = 0;
			count++;
		}
		System.out.println("Output array is: "+Arrays.toString(array));

	}

}
