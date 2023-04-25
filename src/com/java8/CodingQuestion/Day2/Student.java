package com.java8.CodingQuestion.Day2;

import java.util.Date;

public class Student {

	private Integer id;
	private String name;
	private String sclass;
	private String gender;
	private String city;
	private String mobile;
	private Date dob;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String sclass, String gender, String city, String mobile, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.sclass = sclass;
		this.gender = gender;
		this.city = city;
		this.mobile = mobile;
		this.dob = dob;
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

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
