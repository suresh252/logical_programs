package com.logical;

public class PalindromeWithChar {

	public static void main(String[] args) {

		int i;
		String str = "ramana";
		String string = "";
		char[] charArray = str.toCharArray();
		for (i = charArray.length; i > 0; i--) {

			string += charArray[i - 1];
		}
		if (str.equals(string)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
