package com.logicPrograms;

import java.util.Scanner;

public class SumOfNNaturalWithoutLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();
        
        int sum = n * (n + 1) / 2;
        
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);
	}
}
