package com.example.HotelManagment.exception;

public class RoomNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long roomId;
	private String message;
	
	public RoomNotFound(long roomId, String message) {
		this.roomId = roomId;
		this.message = message;
	}
}
