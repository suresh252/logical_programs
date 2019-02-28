package com.logical;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 12340;
		int reverse = 0;
		int digit;
		while (number > 0) {
			digit = number % 10;
			reverse = (reverse * 10) + digit;
			number /= 10;
		}

		System.out.println("reverse number is: " + reverse);
	}

}
