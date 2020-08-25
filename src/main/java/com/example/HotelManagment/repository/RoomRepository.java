package com.example.HotelManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HotelManagment.entity.RoomDetails;

public interface RoomRepository extends JpaRepository<RoomDetails, Long> {

}
