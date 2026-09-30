package com.collect.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupstringsbyfirstcharacter {

	public static void main(String[] args) {
		
		// 🔥 11. Group strings by first character
		
		List<String> names =
		        Arrays.asList("Ram", "Ravi", "Kumar", "Kiran","Vimal");
		
		Map<Character, List<String>> result =
		        names.stream()
		             .collect(Collectors.groupingBy(
		                     a -> a.charAt(0)
		             ));
		
		
		for (Map.Entry<Character, List<String>> i : result.entrySet()) {
			System.out.println(i);
		}

	}

}
