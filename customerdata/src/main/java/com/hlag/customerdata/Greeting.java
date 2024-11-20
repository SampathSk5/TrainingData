package com.hlag.customerdata;

public class Greeting {

	public static void main(String[] args) {

		Greeter greeter = (String name) -> System.out.println("Hello " + name);
		greeter.greet("Alice!");
	}

}

@FunctionalInterface
interface Greeter {

	void greet(String name);
}