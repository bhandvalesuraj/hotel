package com.example.HotelManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HotelManagment.entity.UserProfile;

public interface UserRepository extends JpaRepository<UserProfile, Long> {

}
