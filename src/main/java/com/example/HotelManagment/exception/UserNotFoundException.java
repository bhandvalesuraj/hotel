package com.example.HotelManagment.exception;

public class UserNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long userId;
	private String message;
	
	public UserNotFoundException(String message, long userId){
		this.userId = userId;
		this.message = message;
	}
	
}
