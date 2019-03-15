package com.logical;

public class AlternateLetters {

	public static void main(String[] args) {

		String str = "ABCDEFGH";
		char[] actualArray = str.toCharArray();
		int length = actualArray.length;
		
		char[] requiredArray = new char[length];
		requiredArray[0] = actualArray[0];
		int i = 1;
		for (int j = i; j < length; j = j + 2, i++) {
			requiredArray[j] = actualArray[length - i];
		}
		i = 1;
		for (int j = i + 1; j < length; j = j + 2, i++) {
			requiredArray[j] = actualArray[i];
		}
		String result = new String(requiredArray);
		System.out.println(result);

	}
}
// Required String is :AIBHCGDFE