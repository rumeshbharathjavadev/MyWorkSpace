package com.collect.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collecttest {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);
		
		Map<Boolean,List<Integer>> result=nums.stream().collect(Collectors.partitioningBy(a->a%2==0));
		
		System.out.println(result);

	}

}
