package com.logical2;

import java.util.Scanner;

public class StringAmendment2 {

	public static void main(String[] args) {
		//String str = "HaiHelloJavaWorld";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Sentence: ");
		String str = scanner.nextLine();
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				string = string + " " + Character.toLowerCase(ch);
			} else {
				string = string + ch;
			}

		}
		System.out.println(string);
	}
}
