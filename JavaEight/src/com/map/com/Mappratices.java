package com.map.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mappratices {

	public static void main(String[] args) {

		Map<String, Integer> hs = new HashMap<>();

		hs.put("D", 4);
		hs.put("E", 5);
		hs.put("A", 1);
		hs.put("C", 3);
		hs.put("B", 2);

		hs.entrySet().stream().sorted((a, b) -> -1).forEach(i -> System.out.print(i + " "));
		System.out.println();

		Map<String, Integer> ls = new LinkedHashMap<>();

		ls.put("D", 4);
		ls.put("E", 5);
		ls.put("A", 1);
		ls.put("C", 3);
		ls.put("B", 2);
		ls.entrySet().stream().sorted((a, b) -> -1).forEach(i -> System.out.print(i + " "));
		System.out.println();

		Map<String, Integer> ts = new TreeMap<>();

		ts.put("D", 4);
		ts.put("E", 5);
		ts.put("A", 1);
		ts.put("C", 3);
		ts.put("B", 2);
		ts.entrySet().stream().sorted((a, b) -> -1).forEach(i -> System.out.print(i + " "));

	}

}
