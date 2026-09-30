package com.map.com;

import java.util.Comparator;

public class Compatorordemo implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		int name = e1.getName().compareTo(e2.getName());

		if (name > 0)
			return -1;
		else if (name < 0)
			return 1;
		else
			return 0;

	}

}
