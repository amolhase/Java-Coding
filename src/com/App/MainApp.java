package com.App;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();

		Employee e1 = new Employee("Amol", 24, 30000);
		Employee e2 = new Employee("Rahul", 27, 50000);
		Employee e3 = new Employee("Pramod", 22, 40000);
		Employee e4 = new Employee("Ankit", 21, 10000);
		Employee e5 = new Employee("Akash", 28, 20000);

		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
//		increase the salary of employee whose age > 25
		
		System.out.println("original salary");
		System.out.println(employee);
		
		List<Employee> incrementedSalary = employee.stream().map(e -> {
			if(e.getAge() > 25) {
			e.setSalary(e.getSalary() * 1.1);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println("incremented salary");
		System.out.println(incrementedSalary);

	}
}
