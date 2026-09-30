package com.collect.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NightDuplicateKey {

	public static void main(String[] args) {
		
		// 9. Duplicate Key in toMap()
		
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Ram"),
			    new Employee(101, "Ravi"),
			    new Employee(102, "Kumar")
			);
		
		
		
		Map<Integer, String> oldresult =
		        employees.stream()
		                 .collect(Collectors.toMap(
		                         a -> a.getId(),
		                         a -> a.getName()
		                 ));
		
		
		
		Map<Integer, String> newresult =
		        employees.stream()
		                 .collect(Collectors.toMap(
		                         a -> a.getId(),
		                         a -> a.getName(),
		                         (x, y) -> x
		                 ));
		
		for (Map.Entry<Integer, String> i : oldresult.entrySet()) {
			System.out.println(i);
		}

	}

}
