package com.iterator.com;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorMap {

	public static void main(String[] args) {

		Map<String, Integer> hs = new LinkedHashMap<>();

		hs.put("D", 4);
		hs.put("E", 5);
		hs.put("A", 1);
		hs.put("C", 3);
		hs.put("B", 2);

		Set<String> key = hs.keySet();

		System.out.print("Key    :  ");
		for (String s : key) {
			System.out.print(s + " ");
		}

		System.out.println();

		Collection<Integer> value = hs.values();

		System.out.print("Value  :  ");

		for (Integer i : value) {
			System.out.print(i + " ");
		}

		System.out.println();

		Set<Map.Entry<String, Integer>> entry = hs.entrySet();

		System.out.print("Entry  :  ");
		for (Map.Entry<String, Integer> i : entry) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(" ---------------------------------------------");
		Iterator<Map.Entry<String, Integer>> i = entry.iterator();
		
		while(i.hasNext()) {
			
		Map.Entry<String, Integer>maps=	i.next();
		if(maps.getKey().equals("A")) {
			maps.setValue(9999);
			i.remove();
		}
		}
		

		System.out.println();
		hs.entrySet().stream().forEach(m -> System.out.print(m + " "));

	}

}
