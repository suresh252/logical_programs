package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListtoMap {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "vishnu"));
		list.add(new Student(2, "livan"));
		// System.out.println(list);
		Map<Integer, String> map = new HashMap<>();
		for (Student student : list) {
			map.put(student.getId(), student.getName());

		}

		System.out.println(map);
	}
}
