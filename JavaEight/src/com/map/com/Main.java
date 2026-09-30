package com.map.com;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ramesh", 25000);
		Employee e2 = new Employee(2, "Kumar", 3000);
		Employee e3 = new Employee(3, "Arun", 8000);
		Employee e4 = new Employee(4, "Vijay", 5000);
		Employee e5 = new Employee(5, "Suresh", 40000);

		List<Employee> emplist = Arrays.asList(e1, e2, e3, e4, e5);

	
		emplist.stream()
	       .filter(i -> i.getName().equals("Arun"))
	       .map(i -> {
	           i.setName("Ram");
	           return i;
	       });
	}

}
