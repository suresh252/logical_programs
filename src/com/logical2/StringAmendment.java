package com.logical2;

public class StringAmendment {

	public static void main(String[] args) {

		String str = "HaiJavaWorld";
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {

				string = string + " " + Character.toLowerCase(ch);
			} else {

				string = string + ch;
			}

		}
		System.out.println(string);
	}

}
