package com.arrays;

public class MinMaxValue {

	public static void main(String[] args) {

		int array[] = { 10, 11, 88, 2, 12, 120,222 };

		//System.out.println(array.length);
		
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		System.out.println("min value"+minValue);

		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println("max value"+maxValue);
	}

}
