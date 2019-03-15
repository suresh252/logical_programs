package com.logical;

public class PalindromeWithChar {

	public static void main(String[] args) {

		int i;
		String str = "madama";
		String string = "";
		char[] charArray = str.toCharArray();
		for (i = str.length()-1; i >= 0; i--) {

			string += charArray[i];
		}
		if (str.equals(string)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
