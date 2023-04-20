package com.program.Scenario;

public class StaticAndInstance {
	
	int count = 5;
	
	public  void m1() {
		System.out.println("Value of count in m1 " + count);
		count++;
	}
	
	public  void m2() {
		System.out.println("Value of count in m2 " + count);
	}

	public static void main(String[] args) {
		StaticAndInstance obj1 = new StaticAndInstance();
		//obj1.m1();
		System.out.println("obj1 count " + obj1.count);
		StaticAndInstance obj2 = new StaticAndInstance();
		//obj2.m2();
		System.out.println("obj2 count " + obj2.count);
		
	}
}
