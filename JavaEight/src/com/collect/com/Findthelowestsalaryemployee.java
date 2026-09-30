package com.collect.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Findthelowestsalaryemployee {

	public static void main(String[] args) {
		
		// 🔥 7. Find the lowest salary employee
		
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Arun", "IT", 50000),
			    new Employee(2, "Kumar", "HR", 40000),
			    new Employee(3, "Ravi", "IT", 60000),
			    new Employee(4, "Priya", "Finance", 55000),
			    new Employee(5, "Divya", "HR", 45000),
			    new Employee(6, "Suresh", "IT", 70000),
			    new Employee(7, "Anitha", "Finance", 65000),
			    new Employee(8, "Vijay", "IT", 55000),
			    new Employee(9, "Meena", "HR", 48000),
			    new Employee(10, "Raj", "Finance", 75000),
			    new Employee(101, "Ram", "IT", 50000),
			    new Employee(102, "Ravi", "HR", 40000),
			    new Employee(103, "Kumar", "IT", 60000),
			    new Employee(104, "Arun", "HR", 45000)
			);
		
		Optional<Employee> result =
		        employees.stream()
		                 .collect(Collectors.minBy(
		                         Comparator.comparing(
		                                 a -> a.getSalary()
		                         )
		                 ));
		
		
		System.out.println(result.get());

	}

}
