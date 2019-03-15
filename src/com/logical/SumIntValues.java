package com.logical;

public class SumIntValues {
	public static void main(String[] args) {
		int inputNumber = 523;
		int copyOfNumber = inputNumber;
		
		int sum = 0;
		while (copyOfNumber != 0) {
			int lastDigit = copyOfNumber % 10;
			sum = sum + lastDigit;
			copyOfNumber = copyOfNumber / 10;

		}
		System.out.println("sum of all digits :" + inputNumber + "=" + sum);
	}

}
