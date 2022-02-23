package com.syntax.class14;

public class Task02 {

	/*
	 * Create a method that will take a number and prints whether the number is even
	 * or odd.
	 */
	
	String numbers(int evenNumber, int oddNumber) {
		if (evenNumber % 2 == 0) {
			return evenNumber + " is Even number";
		} else {
			return oddNumber + " is odd number";
		}

	}

	public static void main(String[] args) {

		Task02 obj = new Task02();
		System.out.println(obj.numbers(10, 9));

	}

}
