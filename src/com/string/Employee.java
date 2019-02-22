package com.string;

public class Employee {

	public static void main(String[] args) {

		String[] str = new String[] { "wipro", "cts", "hcl", "tcs" };
		String string = "";

		for (int i = str.length - 1; i >= 0; i--) {

			string += str[i] + " ";
		}
		// System.out.println(string.substring(0, string.length() - 1));
		System.out.println(string);

		char[] charArray = string.toCharArray();
		for (int j = charArray.length - 1; j >= 0; j--) {
			System.out.print(charArray[j]);
		}
	}
	
	
}
