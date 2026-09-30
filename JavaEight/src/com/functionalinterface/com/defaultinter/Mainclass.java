package com.functionalinterface.com.defaultinter;

public class Mainclass implements Vegtables, Furites {

	public static void main(String[] args) {

		Mainclass mainclass = new Mainclass();
		mainclass.Prices(2, 5);
		Vegtables.good();
		Furites.good();

	}

	@Override
	public void Prices(int kg, int que) {

		Vegtables.super.Prices(kg, que);
		Furites.super.Prices(kg, que);
	}

}