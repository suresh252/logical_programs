package com.logical;

public class ReverseString {

	public static void main(String[] args) {
		String str = "ramana";

		char[] charArray = str.toCharArray();
		for (int i = charArray.length; i > 0; i--) {

			System.out.print(charArray[i - 1]);
		}

	}
}
