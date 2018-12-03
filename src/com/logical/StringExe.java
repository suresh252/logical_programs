package com.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringExe {
	public static void main(String[] args) {

		// regular method
		String s = "hai hello happy world";
		List<String> list1 = Arrays.asList(s.split(" "));
		System.out.println(list1);

		// with scanner
		System.out.println("==================================================");

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string :");
		String nextLine = scanner.nextLine();

		List<String> list = Arrays.asList(nextLine.split(" "));
		System.out.println(list);
	}

}
