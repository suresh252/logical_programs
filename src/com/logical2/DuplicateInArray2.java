package com.logical2;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray2 {
	public static void main(String[] args) {
		String[] str = { "suresh", "dinesh", "livan", "shiva", "suresh", "livan" };

		Set<String> set = new HashSet<>();
		for (String string : str) {

			if (!set.add(string)) {
				System.out.println("Duplicate element is: " + string);
			}
		}
	}
}
