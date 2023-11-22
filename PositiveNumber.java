package com.helloworld;

public class PositiveNumber {
	
	public static void main (String []args) {
	
		checkNumber(5);
	}
	public static void checkNumber (int number) {
 		if (number > 0) {
		System.out.println("Positive");
		}
		else if (number < 0) {
			System.out.println("negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}
 