package com.hlag.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.hlag.employee.Employee;

public class RepoImpl {

	public List<Employee> employees = new ArrayList<>();

	public List<Employee> employeeEarnMore() {
		Map<String, Double> filterEmployee = employees.stream()
				.filter(e -> e.getSalary() > 50000)
				.collect(Collectors.toMap(e -> e.getName(), e -> e.getSalary()));
		return employees;
	}

	double totalSalary = employees.stream()
			.filter(e -> e.getSalary() > 50000)
			.map(e -> e.getSalary())
			.reduce(0.0, Double::sum);
}
