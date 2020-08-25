package com.example.HotelManagment.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HotelManagment.entity.RoomDetails;
import com.example.HotelManagment.entity.RoomDto;
import com.example.HotelManagment.entity.UserDto;
import com.example.HotelManagment.entity.UserProfile;
import com.example.HotelManagment.exception.RoomNotFound;
import com.example.HotelManagment.exception.UserNotFoundException;
import com.example.HotelManagment.services.HotelService;

@RestController
@RequestMapping("/hotel/")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	
	@GetMapping("/allusers")
	public ResponseEntity<List<UserProfile>> getAllUsers() {
		
		List<UserProfile> profileList = hotelService.getAllUsers();
		
		if(profileList != null && profileList.size() == 0 ) {
			
		}
		
		return new ResponseEntity<List<UserProfile>>(profileList, HttpStatus.OK); 
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<UserProfile> getUser(@PathVariable("id") Long id ) throws UserNotFoundException {
		
		Optional<UserProfile> user = hotelService.getUser(id);
		
		if(!user.isPresent()) {
			throw new UserNotFoundException("Invalid user", id);
		}
		
		return new ResponseEntity<UserProfile>(user.get(), HttpStatus.OK);
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<String> addUser(@RequestBody @Valid UserDto user) {
		
		UserProfile profile = hotelService.addUser(user);
		
		return ResponseEntity.ok("Success");
	}
	
	
	@GetMapping("/allrooms")
	public List<RoomDetails> getAllRooms() {
		
		return hotelService.getAllRooms();
	}
	
	@GetMapping("/room/{number}")
	public ResponseEntity<RoomDetails> getRoomDetail(@PathVariable("number") Long number) throws RoomNotFound {
		
		 Optional<RoomDetails> roomDetail = hotelService.getRoomDetail(number);
		 if(!roomDetail.isPresent()) {
			 throw new RoomNotFound(number, "Invalid room number.");
		 }
		 
		 return new ResponseEntity<RoomDetails>(roomDetail.get(), HttpStatus.OK);
	}
	
	@PostMapping("/room/update")
	public RoomDetails updateRoomDetails(@RequestBody @Valid RoomDto room) {
		
		return hotelService.updateRoomDetails(room);
	}
	
	@PostMapping("/room/book")
	public RoomDetails addBooking(@RequestBody RoomDto room) {
		
		return hotelService.updateRoomDetails(room);
	}
}
