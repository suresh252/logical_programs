package com.logical;

public class Palindrome1 {

	public static void main(String[] args) {
		String str = "madam";
		String string = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			string = string + str.charAt(i);

		}

		if (str.equals(string)) {

			System.out.println("Polindrom");
		} else {
			System.out.println("Not a Palindrom");
		}

	}

}
