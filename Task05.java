package com.syntax.class14;

public class Task05 {

	String primeNumber(int num) {
		// Write a method to return whether given number is prime or not?

		for (int i = 2; i < num; i++) {
			if (num == 0) {
				return num + " is not a prime number";
			}
		}

		return num + " is a prime number";
	}

	public static void main(String[] args) {

		Task05 obj = new Task05();
		System.out.println(obj.primeNumber(2));

	}

}
