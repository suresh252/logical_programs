package com.logical;

public class MinMaxValues1 {

	public static void main(String[] args) {

		int[] array = { 10, 11, 5, 222, 200, 120 };

		int minValue = array[0];
		int maxValue = array[0];

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] < minValue) {
				minValue = array[i];

			} else if (array[i] > maxValue) {
				maxValue = array[i];

			}

		}
		System.out.println("min value : " + minValue);

		System.out.println("max value : " + maxValue);

	}
}
