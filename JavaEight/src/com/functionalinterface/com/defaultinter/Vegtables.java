package com.functionalinterface.com.defaultinter;

public interface Vegtables {

	default void VegtablesCondition() {
		System.out.println("Vegtables Good Condition ");
	}

	static void good() {
		System.out.println("Vegtables Good Condition ");
	}

	default void Prices(int kg, int que) {
		System.out.println("Vegtables Price " + kg * que + " Rs");
	}

}
