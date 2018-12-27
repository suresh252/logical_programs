package com.logical;

import java.util.HashMap;
import java.util.Map.Entry;

public class IndividualCharCount {

	public static void main(String[] args) {

		String string = "software";
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = string.toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);

			}
		}
		for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + "= " + entry.getValue());
		}

	}

}
