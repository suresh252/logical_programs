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

		System.out.println("==================================================");
		// with scanner

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string :");
		String nextLine = scanner.nextLine();
		scanner.close();

		List<String> list = Arrays.asList(nextLine.split(" "));
		System.out.println(list);
	}

}
