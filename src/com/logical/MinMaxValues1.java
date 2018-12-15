package com.logical;

public class MinMaxValues1 {

	public static void main(String[] args) {

		int array[] = { 10, 11, 8, 222, 1200, 120 };

		// System.out.println(array.length);

		int minValue = array[0];
		int maxValue = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] < minValue) {
				minValue = array[i];

			} else if (array[i] > maxValue) {
				maxValue = array[i];

			}

		}
		System.out.println("min value" + minValue);

		System.out.println("max value" + maxValue);

	}
}
