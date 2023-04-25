package com.java8.CodingQuestion.Day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Day2Main {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1,"Amol","MCS","male","Pune","7620654933",new Date(1999, 1, 1)));
		studentList.add(new Student(2,"Rahul","MBA","male","Pune","9020654933",new Date(1998, 12, 11)));
		studentList.add(new Student(3,"Mohan","MBA","male","Mumbai","9820654933",new Date(1997, 10, 17)));
		studentList.add(new Student(4,"Priti","MCS","female","Mumbai","7657854933",new Date(1995, 11, 19)));
		studentList.add(new Student(5,"Kiran","MCS","male","Pune","8760654933",new Date(1999, 3, 13)));
		studentList.add(new Student(6,"Shivangi","MCA","female","Pune","7620654933",new Date(1996, 1, 19)));
		studentList.add(new Student(7,"Ashutosh","MCS","male","Pune","7620931933",new Date(1997, 2, 12)));
		studentList.add(new Student(8,"Rohan","MCA","male","Pune","7620654933",new Date(1995, 12, 10)));
		studentList.add(new Student(9,"Pratik","MCS","male","Nagpur","7620654933",new Date(1997, 7, 15)));
		studentList.add(new Student(10,"Akash","MBA","male","Mumbai","98640128675",new Date(1999, 3, 15)));
		studentList.add(new Student(11,"Shivani","MCS","female","Pune","9850123876",new Date(1998, 7, 7)));
		studentList.add(new Student(12,"Tanuja","MA","female","Pune","8971054298",new Date(1998, 8, 12)));
		studentList.add(new Student(13,"Sahil","MCS","male","Mumbai","8754321056",new Date(1999, 4, 9)));
		studentList.add(new Student(14,"Rajesh","MA","male","Pune","9765493012",new Date(1997, 12, 10)));
		studentList.add(new Student(15,"Mansi","MCS","female","Pune","9016529871",new Date(1998, 8, 14)));
		studentList.add(new Student(16,"Prakash","MBA","male","Nagpur","8820176543",new Date(1994, 9, 3)));
		studentList.add(new Student(17,"Uddesh","MCA","male","Nagpur","7085318765",new Date(1997, 4, 28)));
		studentList.add(new Student(18,"Vaibhav","MA","male","Pune","7689120765",new Date(1998, 2, 29)));
		studentList.add(new Student(19,"Rupali","MA","female","Mumbai","8630218765",new Date(1993, 11, 1)));
		studentList.add(new Student(20,"Srushti","MCS","female","Pune","9075673187",new Date(1998, 6, 11)));
		studentList.add(new Student(21,"Shivam","MCS","male","Pune","9854673921",new Date(1997, 9, 22)));
		
		//Query - find number of students in each class
		Map<String, Long> studsInEachDepartment = studentList.stream()
				.collect(Collectors.groupingBy(Student::getSclass,Collectors.counting()));
		System.out.println("Students in each department " + studsInEachDepartment);
		System.out.println("------------------------------------------------------------");
		
		//Query - find the all male students located in pune
		List<Student> maleStudentFromPune = studentList.stream()
		.filter(student -> student.getGender().equals("male") && student.getCity().equals("Pune"))
		.collect(Collectors.toList());
		
		maleStudentFromPune.forEach(student -> System.out.println(student.getName()));
		System.out.println("------------------------------------------------------------");
		
		//Query - How many male and female students are there
		Map<String,Long> maleAndFemaleCount = studentList.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println("Total Number of male and female Students " + maleAndFemaleCount);
		System.out.println("------------------------------------------------------------");
		
		//Query - print all the departments from organization
		Set<String> allDepartments = studentList.stream()
				.map(student -> student.getSclass()).collect(Collectors.toSet());
		System.out.println("All the departments are " + allDepartments);
		System.out.println("-------------------------------------------------------------");
		
		//Query - Who is the youngest student in the college
		Student youngStudent =  studentList.stream()
				.max((d1,d2) -> d1.getDob().compareTo(d2.getDob())).get();
		System.out.println("Youngest Student in the college " + youngStudent.getName());
		System.out.println("-------------------------------------------------------------");
		
		//Query - who is most old student in the college
		Student oldStudent = studentList.stream()
				.min((d1,d2) -> d1.getDob().compareTo(d2.getDob())).get();
		System.out.println("OLdest student is " + oldStudent.getName());
		System.out.println("-------------------------------------------------------------");
	}

}
