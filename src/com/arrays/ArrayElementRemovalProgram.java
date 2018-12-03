package com.arrays;

import java.util.Arrays;

public class ArrayElementRemovalProgram {
	public static void main(String[] args) {

		String ss = "raju";

		String buffer = new String(ss);
		// StringBuffer buffer=new StringBuffer(ss);
		System.out.println(ss.equals(buffer) + " is " + buffer == ss);

		String[] a = new String[] { "zero", "one", "two", "three", "four", "five", "six" };
		System.out.println("array before removal is :" + Arrays.toString(a));

	}

}
