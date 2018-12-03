package com.logical;

import java.util.Scanner;

public class PalindromeExe {
	public static void main(String[] args) {

		String a, b;
		StringBuffer sb;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String to check if is a polindrome: ");
		a = scanner.next();
		sb = new StringBuffer(a);

		b = sb.reverse().toString();

		if (a.equals(b)) {
			System.out.print("Enter the String is a polindrome");
		} else {
			System.out.print("Enter the String is not a polindrome");
		}
	}
}
