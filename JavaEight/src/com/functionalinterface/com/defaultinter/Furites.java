package com.functionalinterface.com.defaultinter;

public interface Furites {

	default void FuritesCondition() {
		System.out.println("Furites Good Condition ");
	}

	default void Prices(int kg, int que) {
		System.out.println("Furites Price " + kg * que + " Rs");
	}

	static void good() {
		System.out.println("Furites Good Condition ");
	}
}
