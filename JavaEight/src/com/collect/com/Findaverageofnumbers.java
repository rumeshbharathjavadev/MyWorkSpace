package com.collect.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Findaverageofnumbers {

	public static void main(String[] args) {
		
		// 🔥 14. Find average of numbers
		
		List<Integer> nums =
		        Arrays.asList(10, 20, 30, 40);
		
		Double result =
		        nums.stream()
		            .collect(Collectors.averagingInt(
		                    a -> a
		            ));
		
		System.out.println(result);

	}

}
