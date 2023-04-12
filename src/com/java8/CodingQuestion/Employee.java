package com.java8.CodingQuestion;

public class Employee {

	private Integer id;
	private String name;
	private String Designation;
	private String Department;
	private Double Salary;

	public Employee(Integer id, String name, String designation, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		Designation = designation;
		Department = department;
		Salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

}
