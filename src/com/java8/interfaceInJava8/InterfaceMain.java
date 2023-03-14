package com.java8.interfaceInJava8;

public class InterfaceMain implements TestInterface1,TestInterface2 {
	
	@Override
	public void square(int a) {
		System.out.println("Square is " + (a*a));
		
	}
	
	@Override
	public void cube(int a) {
		System.out.println("Cube is " + (a*a*a));
		
	}

	public static void main(String[] args) {
		
		InterfaceMain obj = new InterfaceMain();
		obj.square(5);
		//called default show method
		obj.show();
		//called static show method
		TestInterface2.show();
		obj.cube(5);
	
	}

}
