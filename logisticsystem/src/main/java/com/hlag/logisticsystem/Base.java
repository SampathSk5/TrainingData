package com.hlag.logisticsystem;

public class Base {

	int value1;
	int value2;

	// public base() {
	//
	// }

	protected Base(int value1, int value2) {

		this.value1 = value1;
		this.value2 = value2;
	}

	public static void test() {
		System.out.println("from base ");
	}

}