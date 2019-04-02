package com.string;

public class Test123 {

	public static void main(String[] args) {

		String str = "ABCDEF";
		char[] actualArray = str.toCharArray();
		int length = actualArray.length;
		char[] reqArray = new char[length];
		reqArray[0] = actualArray[0];
		int i = 1;
		for (int j = i; j < length; j = j + 2, i++) {
			reqArray[j] = actualArray[length - i];
		}
		i = 1;
		for (int j = i + 1; j < length; j = j + 2, i++) {
			reqArray[j] = actualArray[i];
		}
		
		String string = new String(reqArray);
		System.out.println(string);
	}
}
