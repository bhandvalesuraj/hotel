package com.example.HotelManagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="userprofile")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	@NotEmpty(message="First name is required")
	private String firstname;
	
	@NotEmpty(message="Last name is required")
	private String lastname;
	
	@NotEmpty(message="Mobile number is required")
	@Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
    		message="Mobile number is invalid")
	private String mobilenumber;
	
	@NotEmpty(message = "Required to enter user Address ")
	private String address;

	//@Value("100")
	@Column(name="pointsbalance", columnDefinition = "int default 100")
	private Integer pointsbalance = 100;
	
	public Long getUserId() {
		return userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPointsbalance() {
		return pointsbalance;
	}

	public void setPointsbalance(Integer pointsbalance) {
		this.pointsbalance = pointsbalance;
	}
	
	
	
}
