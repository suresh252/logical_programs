package com.string;

public class SwapTwoNumbers {
	public static void main(String[] s) {
		

		int a = 10;
		int b = 20;

		System.out.println("Before swapping - a: " + a + ", b: " + b);
		//// without using thrid variable
		a=a+b;
		b=a-b;
		a=a-b;
		////////////////////// using 3rd variable
		//int temp;
		//temp=a;
		//a=b;
		//b=temp;
		System.out.println("After swapping  - a: " + a + ", b: " + b);
	}
}
