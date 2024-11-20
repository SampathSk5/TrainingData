package com.hlag.customerdata;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class LambdaExpression {

	public static void main(String[] args) {

	}

	public static void demo() {

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		map.forEach((k, v) -> {
			System.out.println(k + "" + v);
		});
		Function<Integer, Boolean> function1 = i -> i % 7 == 0;
		Function<String, Integer> function = x -> x.length();
		Function<Integer, Integer> fun2 = x -> x * 2;
		// int result2 = function1.andThen(fun2).apply("hello");
		System.out.println(function1.apply(63));
	}
}
