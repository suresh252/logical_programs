package com.arrays;

import java.util.Arrays;

public class SotingArray {

	public static void main(String[] args) {

		String[] array = { "suresh", "venu", "prasad", "naresh" };
		//Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i].equals(array[j])) {

					
				}
			}

		}
		System.out.println(Arrays.toString(array));

	}

}
