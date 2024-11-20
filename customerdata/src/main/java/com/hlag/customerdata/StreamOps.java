package com.hlag.customerdata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOps {

	public static void main(String[] args) {

		// /long startTimeMillis = System.currentTimeMillis();
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "graps", "mango");
		// List<String> result = new ArrayList<>();
		// for (String word : words) {
		// if (word.length() > 5) {
		// result.add(word.toUpperCase());
		// }
		// }
		// long endtimeMillis = System.currentTimeMillis();
		// System.out.println("Current time in milliseconds: " + (endtimeMillis - startTimeMillis));
		List<String> result = words.stream()
				.filter(e -> e.length() > 5)
				.map(e -> e.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(result);
		result.stream().forEach(e -> System.out.println(e));
		result.forEach(e -> System.out.println(e));

	}

}
