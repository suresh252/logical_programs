package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExe {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		//HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "suresh");
		map.put(2, "ramesh");
		map.put(3, "ravi");
		System.out.println(map);

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			if (key.equals(2)) {
				map.put(4, "veeresh");
			}

		}
		System.out.println(map);

	}

}
