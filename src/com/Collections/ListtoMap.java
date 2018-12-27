package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListtoMap {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(0, "vishnu"));
		list.add(new Student(1, "livan"));
		list.add(new Student(2, "suresh"));

		// System.out.println(list.get(0));

		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			Student student = (Student) itr.next();
			System.out.println(student.getId() + ":" + student.getName());
		}

		/*for (int i = 0; i <= list.size() - 1; i++) {
			Student std = list.get(i);
			System.out.println(std.getId() + "=" + std.getName());
		}*/

		Map<Integer, String> map = new HashMap<>();
		for (Student student : list) {

			map.put(student.getId(), student.getName());

		}

		System.out.println(map);
	}
}
