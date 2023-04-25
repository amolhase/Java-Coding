package com.Exception.CustomException;

import java.util.Scanner;

public class ExceptionMainClass {

	
	public static void main(String[] args) throws InvalidAgeException {
		
		System.out.println("Program started");
		System.out.println("Enter the age to apply for driving license");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age > 18 && age < 65) {
			System.out.println("Successfully applied for driving license");
		}
		else {
			throw new InvalidAgeException();
		}
		System.out.println("Program Terminated..");
	}
	
}
