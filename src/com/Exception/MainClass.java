package com.Exception;
import com.Exception.CustomException;

class MainClass {
	public static void main(String[] args) {
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
