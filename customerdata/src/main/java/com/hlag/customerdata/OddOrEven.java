package com.hlag.customerdata;

public class OddOrEven {

	public static void main(String[] args) {

		Add add = number -> number % 2 == 0;

		if (add.check(10)) {
			System.err.println("Number is Even");
		} else {
			System.err.println("Number is Odd");
		}
	}
}

@FunctionalInterface
interface Add {

	boolean check(int number);
}