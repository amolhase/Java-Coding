package com.java8.CodingQuestion.Day1;

public class Employee {

	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String department;
	private Integer year_of_joining;
	private Double salary;

	public Employee(Integer id, String name, Integer age, String gender, String department, Integer year_of_joining,
			Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.year_of_joining = year_of_joining;
		this.salary = salary;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getYear_of_joining() {
		return year_of_joining;
	}

	public void setYear_of_joining(Integer year_of_joining) {
		this.year_of_joining = year_of_joining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
