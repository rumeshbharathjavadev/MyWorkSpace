package com.collect.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Findthelongeststringusing {

	public static void main(String[] args) {
		
		
		// 🔥 10. Find the longest string using collect()
		
		List<String> names =
		        Arrays.asList("Ram", "Ravi", "Kumar", "Alexander");
		
		Optional<String> result =
		        names.stream()
		             .collect(Collectors.maxBy(
		                     Comparator.comparing(
		                             a -> a.length()
		                     )
		             ));
		
		
		System.out.println(result.get());

	}

}
