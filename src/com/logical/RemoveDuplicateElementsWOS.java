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
		
		List<String> Ndlist = new ArrayList<>();
		Iterator<String> iterator = Dlist.iterator();
		while (iterator.hasNext()) {
			
			String Dname = iterator.next();
			if (Ndlist.contains(Dname)) {
				iterator.remove();
			} else {
				Ndlist.add(Dname);
			}

		}
		System.out.println(Ndlist);
	}
}
