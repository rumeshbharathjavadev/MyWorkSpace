package com.iterator.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.map.com.Employee;



public class IteratorList {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ramesh", 25000);
		Employee e2 = new Employee(2, "Kumar", 3000);
		Employee e3 = new Employee(3, "Arun", 8000);
		Employee e4 = new Employee(4, "Vijay", 5000);
		Employee e5 = new Employee(5, "Suresh", 40000);

		List<Employee> employees =
		        new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

		Iterator<Employee> i = employees.iterator();

		while (i.hasNext()) {

			Employee obj=i.next();
			
			if (obj.getName().equals("Vijay")) {
				i.remove();
			}
			
		}
		
		
		
		
		System.out.println();
		for (Employee emp : employees) {

			System.out.println(emp);
		}

	}
}
