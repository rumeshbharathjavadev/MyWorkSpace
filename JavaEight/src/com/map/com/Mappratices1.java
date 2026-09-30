package com.map.com;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Mappratices1 {
	public static void main(String[] args) {

		Map<String, Integer> hs = new HashMap<>();

		hs.put("D", 4);
		hs.put("E", 5);
		hs.put("A", 1);
		hs.put("C", 3);
		hs.put("B", 2);
		
		
		hs.entrySet().stream().sorted((a,b)->b.getKey().compareTo(a.getKey())).forEach(i->System.out.println(i));
		
		
		
		Map<Object, Object> result= hs.entrySet().stream().filter(i->i.getKey().equals("B")).map(i->{i.setValue(999);return i;}).collect(Collectors.toMap(a->a.getKey(), b->b.getValue()));
	
		for (Map.Entry<Object, Object> i: result.entrySet()) {
			System.out.println(result);
		}
		hs.entrySet().stream().sorted((a,b)->b.getKey().compareTo(a.getKey())).forEach(i->System.out.println(i));
		
	}

}
