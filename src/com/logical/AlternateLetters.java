package com.logical;

public class AlternateLetters {

	public static void main(String[] args) {
		String str = "ABCDEFGH";
		String string = "";
		char[] actualArray = str.toCharArray();

		for (int i = 0; i < actualArray.length; i++) {

			string += actualArray[i];
		}
		System.out.println("atual String is :" + string);

		int size = actualArray.length;
		char[] requiredArray = new char[size];

		int i, j;
		i = 1;
		requiredArray[0] = actualArray[0];

		for (j = i; j < size; j = j + 2, i++) {
			requiredArray[j] = actualArray[size - i];
		}
		i = 1;
		for (j = i + 1; j < size; j = j + 2, i++) {
			requiredArray[j] = actualArray[size - (size - i)];

		}

		String result = new String(requiredArray);
		System.out.println("\nRequired String is :" + result);
	}
}
