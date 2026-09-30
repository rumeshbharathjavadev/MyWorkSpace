package com.collect.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Findtotalofnumbers {

	public static void main(String[] args) {
		
		// 🔥 13. Find total of numbers using collect()
		
		List<Integer> nums =
		        Arrays.asList(10, 20, 30, 40);
		
		Integer result =
		        nums.stream()
		            .collect(Collectors.summingInt(
		                    a -> a
		            ));
		
		System.out.println(result);

	}

}
