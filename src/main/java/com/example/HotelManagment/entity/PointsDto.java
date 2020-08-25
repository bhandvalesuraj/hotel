package com.example.HotelManagment.entity;

import javax.validation.constraints.NotEmpty;

public class PointsDto {

	@NotEmpty(message="Enter valid user id.")
	private Long userId;
	
	@NotEmpty(message="Enter points count.")
	private int totalpoints;
}
