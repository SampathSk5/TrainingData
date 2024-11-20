package com.hlag.customerdata;

public class lamdapracties {

	public static void main(String[] args) {

		Divider divideBySeven = (int number) -> number / 7;
		int result = (int) divideBySeven.divide(80);
		System.out.println(result);
		demo((number) -> number/7);
	}

	public static void demo(Divider divideBySeven) {
		System.out.println(divideBySeven.divide(28));
	}
}

@FunctionalInterface
interface Divider {

	double divide(int number);
}
