package com.syntax.class14;

public class Task01 {

	// Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.
	
	String checkNumbers(int smallerNumber, int biggerNumber) {
		if (biggerNumber > smallerNumber) {
			return biggerNumber + " is larger number";

		} else {
			return smallerNumber + " is smaller number";

		}

	}

	public static void main(String[] args) {

		Task01 obj = new Task01();

		String result = obj.checkNumbers(20, 10);
		System.out.println(result);

	}

}
