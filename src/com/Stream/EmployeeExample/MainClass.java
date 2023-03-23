package com.Stream.EmployeeExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee(1, "Amol", "Male", "IT", 20000);
		Employee e2 = new Employee(1, "Rahul", "Male", "IT", 40000);
		Employee e3 = new Employee(1, "Ankit", "Male", "HR", 50000);
		Employee e4 = new Employee(1, "Nilesh", "Male", "IT", 10000);
		Employee e5 = new Employee(1, "Jayesh", "Male", "IT", 30000);
		Employee e6 = new Employee(1, "Tushar", "Male", "HR", 20000);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);

		// print highest paid employee in department IT
		Employee e = employeeList.stream().filter(employee -> employee.getDepartment().equals("IT"))
				.max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		
		// print highest paid employee in department
		Employee emp = employeeList.stream()
				.max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);

		System.out
				.println("Highest Paid employee is " + e.getName() +" "+ e.getGender() +" "+ e.getDepartment() +" "+ e.getSalary());
	}

}
