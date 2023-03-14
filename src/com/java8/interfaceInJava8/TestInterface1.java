package com.java8.interfaceInJava8;

public interface TestInterface1 {

	//abstract method
	public void square(int a);
	
	//default method which in introduced in java 8
	default void show() {
		System.out.println("Default show method");
	}
}

interface TestInterface2 {
	//abstract method
	public void cube(int a);
	
	//static method introduced in java 8
	static void show() {
		System.out.println("Static show method");
	}
}
