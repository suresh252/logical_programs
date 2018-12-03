package com.logical;

public class ReverseString {

	public static void main(String[] args) {
		String str = "ramana";
		String string = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			string = string + str.charAt(i);
		}
		System.out.println("reverse string is: " + string);
	}
}
