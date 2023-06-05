package com.greatlearning.main;

public class UserException extends Exception{
	
	String message;
	
	public UserException() {
		
	}

	UserException(String message){
		this.message = message;
	}
	
}
