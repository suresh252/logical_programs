package com.logical;

public class ReverseString1 {
	public static void main(String[] args) {
		String str = "sagar";
		String string = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			string = string + str.charAt(i);
		}
		System.out.println(string);

	}

}
