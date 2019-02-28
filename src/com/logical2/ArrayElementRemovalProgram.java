package com.logical2;

import java.util.Arrays;

public class ArrayElementRemovalProgram {

	public static void main(String[] args) {

		String[] array = new String[] { "zero", "one", "two", "three", "four", "five", "six" };

		System.out.println("Original array: " + Arrays.toString(array));

		int removeIndex = 3;

		for (int i = removeIndex; i < array.length - 1; i++) {
			array[i] = array[i + 1];

		}
		System.out.println("after removing array" + Arrays.toString(array));
	}

}
