package com.gspan.RestAssuredEx1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetFemaleAndMaleGenderCount {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0)

		);

		Map<String, Integer> genderCount = new HashMap<String, Integer>();

		for (Employee e : employeeList) {

			String gender = e.getGender();

			genderCount.put(gender, genderCount.getOrDefault(gender, 0) + 1);

		}

		System.out.println("Gender count:" + genderCount);

		// using java 8

		// ALT+SHIFT+L

		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("Employee Gender Count::" + collect);

		System.out.println("Get Oldest Employee........");

		Optional<Employee> max = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

		max.ifPresent(emp -> {

			System.out.println("Employee ID:" + emp.getId());

			System.out.println("Employee Name:" + emp.getName());

			System.out.println("Employee Salary:" + emp.getSalary());

		});

		if (!max.isPresent()) {

			System.out.println("Empty List...........");

		}

	}

}
