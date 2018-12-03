package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReadOnlyList {
	public static void main(String[] args) {

		try {

			List<Character> list = new ArrayList<>();
			list.add('a');
			list.add('b');
			list.add('c');
			List<Character> unmodifiableList = Collections.unmodifiableList(list);
			System.out.println(unmodifiableList);
			unmodifiableList.add('d');
		} catch (UnsupportedOperationException e) {
			// r e.printStackTrace();
			System.out.println(e);

		}

	}
}
