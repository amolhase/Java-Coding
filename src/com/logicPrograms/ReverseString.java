package com.logicPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String input = sc.nextLine();
		String output = "";
		
		for(int i=input.length()-1; i>=0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println("Original String is "+ input);
		System.out.println("Reverse String is "+ output);
		
		if(input.equals(output)) {
			System.out.println("Strings are palinderome");
		} else {
			System.out.println("Strings are not palindrome");
		}
	}
}
