package com.java8.CodingQuestion.Day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day1Main {

	
	public static void main(String[] args) {
		
	  List<Employee> employeeList = new ArrayList<>();
	  
	    employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
//		We cannot reuse the stream
//		
//		Stream obj = employeeList.stream();
//		obj.count();
//		obj.findFirst().orElse(null);
		
		// Query 1 : How many male and female employees are there in the organization?
		System.out.println(employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
		
		System.out.println(employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
		
		// Query 2 : Print the name of all departments in the organization?
		
		List<String> department = employeeList.stream().map(data -> data.getDepartment()).distinct().collect(Collectors.toList());
		System.out.println("Department --> " + department);
		
		// Query 3 : What is the average age of male and female employees?
		
		Map<String, Double> averageAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Average age of gender --> " + averageAge);
		
		// Query 4 : Get the details of highest paid employee in the organization?
		
		Employee e = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
		System.out.println("Highest paid Employee is " + e.getName() + " " + e.getSalary() + " " + e.getDepartment());
		
		// Query 5 : Get the names of all employees who have joined after 2015?
		List<Employee> employeeJoinedAfter2015 = employeeList.stream()
		       .filter(employee -> employee.getYear_of_joining() > 2015).collect(Collectors.toList());
		System.out.println("List of Employee who joined after 2015 ");
		employeeJoinedAfter2015.forEach(emp -> System.out.println(emp.getName() + " " + emp.getDepartment()));
		
		// Query 6 : Count the number of employees in each department?
		Map<String,Long> employeeCountWithDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("Employee in each department "+ employeeCountWithDepartment);
		
		// Query 7 : What is the average salary of each department?
		Map<String, Double> averageSalary = employeeList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Average Salary " + averageSalary);
		
		// Query 8 : Get the details of youngest male employee in the product development department?
		Employee youngestEmployee = employeeList.stream().filter(employee -> employee.getDepartment().equals("Product Development") && 
				employee.getGender().equals("Male")).collect(Collectors.minBy(Comparator.comparingDouble(Employee::getAge))).get();
		System.out.println("Youngest Employee " + youngestEmployee.getName() + " " + youngestEmployee.getAge() + " " +
				youngestEmployee.getDepartment() + " " + youngestEmployee.getGender());
		
		// Query 9 : Who has the most working experience in the organization?
		Employee experiencedEmployee = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Employee::getYear_of_joining))).get();
		System.out.println("MOst Experienced Employee " + experiencedEmployee.getName() + " " + 
				experiencedEmployee.getAge() + " " + experiencedEmployee.getDepartment());
		
		// Query 10 : How many male and female employees are there in the sales and marketing team?
		Map<String,Long> SalesAndMarketingCount = employeeList.stream()
				.filter(emp -> emp.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("Sales And Marketing people count "+ SalesAndMarketingCount);
		
		// Query 11 : What is the average salary of male and female employees?
		Map<String, Double> averageSalaryOfMaleAndFemale = employeeList.stream()
		.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Average salary of Male and Female Employee " + averageSalaryOfMaleAndFemale);
		
		// Query 12 : List down the names of all employees in each department?
	   Map<String, List<Employee>> employeeInEachDepartment = employeeList.stream()
			   .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
	   System.out.println("Employee In Each Department ");
	   employeeInEachDepartment.forEach((e1,e2) -> {
		   System.out.println("Employee of " + e1 + " department");
		   e2.forEach(employee -> System.out.println(employee.getName()));
	   });
	   
	// Query 13 : What is the average salary and total salary of the whole organization?
	   Double averagingSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	   Double totalSalary = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
	   System.out.println("Averaging salary of Organization is " + averagingSalary);
	   System.out.println("Total salary of organiztion is " + totalSalary);
	   
	// Query 14 : Separate` the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		List<Employee> employeeLessThan25Year = employeeList.stream()
				.filter(employee -> employee.getAge()<=25).collect(Collectors.toList());
		System.out.println("Employee whose age is less than 25 years ");
		employeeLessThan25Year.forEach(emp -> System.out.println(emp.getName()));
		
		// Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Employee oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("OLdest Employee in the organization is " + oldestEmployee.getName() + 
				" And his age is " + oldestEmployee.getAge());
		
	}
	
}
