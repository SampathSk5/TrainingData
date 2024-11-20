package com.hlag.logisticsystem;

public class Derived extends Base {

	protected Derived(int value1, int value2) {
		super(value1, value2);
	}

	public static void test() {
		System.out.println("from derived ");
	}

}
