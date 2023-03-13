package com.Employee.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		Employee e1 = new Employee("Amol", 23, "male", "IT");
		Employee e2 = new Employee("Manasi", 33, "female", "HR");
		Employee e3 = new Employee("Satish", 28, "male", "HR");
		Employee e4 = new Employee("Rohini", 27, "female", "IT");

//		print the unique department from list
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		employees.stream().map(emp -> emp.getDepartment()).distinct().forEach(System.out::println);

//		print the department name along with its count
		Map<String, Long> departmentCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(departmentCount);

//		print the average age of gender
		Map<String, Double> avgAge = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	
		System.out.println(avgAge);
	}
}
