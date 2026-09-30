package com.collect.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EightConvertListtoMap {

	public static void main(String[] args) {

		// 8. Convert List to Map using toMap()

		List<Employee> employees = Arrays.asList(new Employee(101, "Ram"), new Employee(102, "Ravi"),
				new Employee(103, "Kumar"));

		Map<Integer, String> result = employees.stream().collect(Collectors.toMap(a -> a.getId(), a -> a.getName()));

		for (Map.Entry<Integer, String> i : result.entrySet()) {
			System.out.println(i);
		}

	}

}
