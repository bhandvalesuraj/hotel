package com.example.HotelManagment.entity;

import javax.validation.constraints.NotEmpty;

public class RoomDto {

	private Long roomnumber;
	
	@NotEmpty(message="Enter room description. e.g floor, wing etc.")
	private String description;
	
	@NotEmpty(message="Enter room type. e.g AC, Non-AC")
	private String roomType;
	
	private double bookprice;
	
	@NotEmpty(message="Add current status. e.g BOOKED, AVAILABLE, APPROVAL_PENDING")
	private String currentstatus;
	
	private String allocatedto;

	public Long getRoomnumber() {
		return roomnumber;
	}

	public String getDescription() {
		return description;
	}

	public String getRoomType() {
		return roomType;
	}

	public double getBookprice() {
		return bookprice;
	}

	public String getCurrentstatus() {
		return currentstatus;
	}

	public String getAllocatedto() {
		return allocatedto;
	}

	public void setRoomnumber(Long roomnumber) {
		this.roomnumber = roomnumber;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}

	public void setAllocatedto(String allocatedto) {
		this.allocatedto = allocatedto;
	}
	
}
