package com.Exception;

class MainClass {
	public static void main(String[] args) {
		int x = 10;
		try {
			if(10 == 10) {
				throw new CustomException("0 is not divisible");
			}
		}
		catch(CustomException e) {
			System.out.println("Custom Exception output "+ e);
		}
	}
}
