package com.Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>(new MyComparator());

		set.add(10);
		set.add(15);
		set.add(5);
		set.add(50);
		set.add(0);
		set.add(15);
		set.add(4);
		set.add(40);
		set.add(6);
		set.add(45);
		set.add(60);
		System.out.println(set);

	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {

		// general
		/*
		 * if (i1 < i2) return +1; else if (i1 > i2)
		 * 
		 * return -1; else return 0;
		 */
		// return i1.compareTo(i2);=========> [0, 4, 5, 6, 10, 15, 40, 45, 50, 60]
		// assending order
		// return -i1.compareTo(i2);=======[60, 50, 45, 40, 15, 10, 6, 5, 4, 0]
		// dessending order
		// return i2.compareTo(i1); ========== [60, 50, 45, 40, 15, 10, 6, 5, 4, 0]
		// dessending order
		// return -i2.compareTo(i1); =========== [0, 4, 5, 6, 10, 15, 40, 45, 50, 60]
		// assending order
		// return +1; ==== assending sorting order
		// return -1; ====== dessending sorting order
		return 0; // only first element

	}

}
