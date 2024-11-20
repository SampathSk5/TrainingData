package com.hlag.employee;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee("Alice", 60000, "IT", 30),
				new Employee("Bob", 45000, "HR", 25),
				new Employee("Charlie", 55000, "IT", 35),
				new Employee("David", 30000, "Finance", 40),
				new Employee("Eve", 70000, "IT", 29));

		List<Integer> numbers = IntStream.range(1, 10_000_000).boxed().collect(Collectors.toList());
		Instant start = Instant.now();
		long sequentialSum = numbers.parallelStream().mapToLong(n -> (long) n * n).sum();
		Instant end = Instant.now();
		System.out
				.println("Sequential Sum: " + sequentialSum + ", Time: " + (end.toEpochMilli() - start.toEpochMilli()) + "ms");
	}

}
