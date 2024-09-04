package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.app.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
