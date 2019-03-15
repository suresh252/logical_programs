package com.logical;

public class PalindromeInteger {

	public static void main(String[] args) {

		int digit, sum = 0, temp;
		int n = 545;

		temp = n;
		while (n > 0) {

			digit = n % 10;
			sum = (sum * 10) + digit;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("given number is a palindrome.");
		} else {
			System.out.println("given number is a not a palindrome.");
		}

	}

}
