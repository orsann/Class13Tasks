package com.syntax.class14;

public class Task04 {
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	 * 
	 */
	
	String createEmail(String name, String lastName, String email ) {
		
		return name+lastName+"@"+email;
		
	}
		
		
	public static void main(String[] args) {
			
		Task04 obj = new Task04();
		System.out.println(obj.createEmail("john", "snow", "gmail.com"));

	}

}
