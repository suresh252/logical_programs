package com.logical2;

//Using Brute Force Method
public class DuplicateInArray {
	public static void main(String[] args) {
		String[] str = { "suresh", "ramesh", "dinesh", "suresh", "livan", "dinesh" };

		System.out.println("duplicate elements is: ");
		
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if ((str[i].equals(str[j])) && (i != j)) {

					System.out.println(str[j]);
				}
			}
		}
	}
}
