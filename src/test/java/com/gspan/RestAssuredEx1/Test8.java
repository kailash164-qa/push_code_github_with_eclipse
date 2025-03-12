package com.gspan.RestAssuredEx1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test8 {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("apple", "cat", "apple", "cat");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : asList) {

			if (map.containsKey(str)) {

				map.put(str, map.get(str) + 1);

			} else {
				map.put(str, 1);
			}

		}

		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()> 1) {

				System.out.println(entry.getKey() + ":" + entry.getValue());

			}
		}
	}

}
