package com.collect.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Finduniqueelements {

	public static void main(String[] args) {
		
		
		// 🔥 3. Find unique elements

		List<Integer> nums =
		        Arrays.asList(10, 20, 10, 30, 20, 10);
		
		Map<Integer, Integer> count =
		        nums.stream()
		            .collect(Collectors.toMap(
		                    a -> a,
		                    a -> 1,
		                    (x, y) -> x + y
		            ));
		
		List<Integer> unique =
		        count.entrySet()
		             .stream()
		             .filter(a -> a.getValue() == 1)
		             .map(a -> a.getKey())
		             .collect(Collectors.toList());

		System.out.println(unique);
	}

}
