package com.example.HotelManagment.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HotelManagment.entity.RoomDetails;
import com.example.HotelManagment.entity.RoomDto;
import com.example.HotelManagment.entity.UserDto;
import com.example.HotelManagment.entity.UserProfile;
import com.example.HotelManagment.repository.RoomRepository;
import com.example.HotelManagment.repository.UserRepository;

@Service
@Transactional
public class HotelService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private RoomRepository roomRepository;
	
	public List<UserProfile> getAllUsers() {
		
		return userRepository.findAll();
	}
	
	public Optional<UserProfile> getUser(Long id ) {
		
		return userRepository.findById(id);
	}
	
	public UserProfile addUser(UserDto user) {
		
		UserProfile newUser = new UserProfile();
		
		newUser.setFirstname(user.getFirstname());
		newUser.setLastname(user.getLastname());
		newUser.setMobilenumber(user.getMobilenumber());
		newUser.setAddress(user.getAddress());
		
		UserProfile addedUser =  userRepository.save(newUser);
		
		return addedUser;
	}
	
	public UserProfile updateUser(UserDto user) {
		
		UserProfile newUser = new UserProfile();
		newUser.setUserId(user.getUserId());
		newUser.setFirstname(user.getFirstname());
		newUser.setLastname(user.getLastname());
		newUser.setMobilenumber(user.getMobilenumber());
		newUser.setAddress(user.getAddress());
		
		UserProfile addedUser =  userRepository.save(newUser);
		
		return addedUser;
	}
	
	public List<RoomDetails> getAllRooms() {
		
		return roomRepository.findAll();
	}
	
	public Optional<RoomDetails> getRoomDetail(Long roomnumber) {
		
		return roomRepository.findById(roomnumber);
	}
	
	public RoomDetails updateRoomDetails(RoomDto room) {
		RoomDetails rd = new RoomDetails();
		rd.setRoomnumber(room.getRoomnumber());
		rd.setDescription(room.getDescription());
		rd.setRoomType(room.getRoomType());
		rd.setCurrentstatus(room.getCurrentstatus());
		rd.setBookprice(room.getBookprice());
		rd.setAllocatedto(room.getAllocatedto());
		RoomDetails  roomDetails = roomRepository.save(rd);
		
		return roomDetails;
	}
	
	public RoomDetails AddRoomDetails(RoomDto room) {
		RoomDetails rd = new RoomDetails();

		rd.setDescription(room.getDescription());
		rd.setRoomType(room.getRoomType());
		rd.setCurrentstatus(room.getCurrentstatus());
		rd.setBookprice(room.getBookprice());
		rd.setAllocatedto(room.getAllocatedto());
		RoomDetails  roomDetails = roomRepository.save(rd);
		
		return roomDetails;
	}
}
