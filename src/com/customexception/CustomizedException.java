package com.customexception;

public class CustomizedException {

	public static void main(String[] args) {
		
	
		int age = 50;
		
		if (age > 60) {
			throw new TooOldException("marraige age is already crossed!!!");
		} else if (age < 18) {
			throw new TooYoungException("wait for some more time!!!");
		} else {
			System.out.println("you will get a match details by email !!!");
		}

	}

}

class TooYoungException extends RuntimeException {

	public TooYoungException(String s) {
		super(s); // To make description available to default exception handler
	}
}

class TooOldException extends RuntimeException {

	public TooOldException(String s) {
		super(s);
	}
}