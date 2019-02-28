package com.logical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateElementsWOS {
	public static void main(String[] args) {

		List<String> Dlist = new ArrayList<>();
		Dlist.add("suresh");
		Dlist.add("shiva");
		Dlist.add("ramesh");
		Dlist.add("naresh");
		Dlist.add("suresh");
		Dlist.add("naresh");

		List<String> Ndlist = new ArrayList<>();
		List<Object> DuplicateNames = new ArrayList<>();
		for (String string : Dlist) {

			if (!Ndlist.contains(string)) {
				Ndlist.add(string);
			} else if (Ndlist.contains(string)) {
				DuplicateNames.add(string);

			}

		}

		/*
		 * List<String> Ndlist = new ArrayList<>(); ArrayList<String> DuplicateNames =
		 * new ArrayList<>(); Iterator<String> iterator = Dlist.iterator(); while
		 * (iterator.hasNext()) {
		 * 
		 * String Dname = iterator.next(); if (Ndlist.contains(Dname)) {
		 * DuplicateNames.add(Dname); iterator.remove();
		 * 
		 * } else { Ndlist.add(Dname); }
		 * 
		 * }
		 */

		System.out.println("Duplicate Elements " + DuplicateNames);
		System.out.println("Without Duplicate Elements " + Ndlist);
	}
}
