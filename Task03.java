package com.syntax.class14;

public class Task03 {
	     /*
	      * Create a method that will say Hello in different language based on the
	      * country that will passed when method is executed.
	      */

	    String sayHello(String country) {

		if (country.equalsIgnoreCase("England")) {
			return "Hello";
		} else if (country.equalsIgnoreCase("Germany")) {
			return "Hallo";
		} else if (country.equalsIgnoreCase("Brazil")) {
			return "Ola";
		} else if (country.equalsIgnoreCase("Turkey")) {
			return "Merhaba";
		} else {
			return "Unknown";
		}
	}

	public static void main(String[] args) {

		Task03 obj = new Task03();

		System.out.println(obj.sayHello("Turkey"));

	}

}
