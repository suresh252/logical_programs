package com.logical;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 123405;
		int reverse = 0;
		int digit;
		while (number != 0) {
			digit = number % 100;
			reverse = reverse * 10 + digit;
			number /= 10;
		}

		System.out.println("reverse number is: " + reverse);
	}

}
