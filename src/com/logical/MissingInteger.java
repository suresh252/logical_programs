package com.logical;

import java.util.Arrays;
import java.util.BitSet;

public class MissingInteger {

	public static void main(String[] args) {
		printMissingNumber(new int[] { 2, 3, 6 }, 10);
	}
	
	private static void printMissingNumber(int[] numbers, int count) {

		int missingcount = count - numbers.length;

		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),
				count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingcount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.print(" "+ ++lastMissingIndex);
		}

	}
}
