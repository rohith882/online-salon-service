package com.app.service;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.BookingDto;
import com.app.entity.Booking;
import com.app.repository.BookingRepo;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepo bookingRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public BookingDto createBooking(BookingDto bookingDto) {
		Booking booking = modelMapper.map(bookingDto, Booking.class);
		Booking savedBooking = bookingRepository.save(booking);
		return modelMapper.map(savedBooking, BookingDto.class);
	}

	@Override
	public BookingDto getBookingById(Long id) {
		Booking booking = bookingRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));
		return modelMapper.map(booking, BookingDto.class);
	}

	@Override
	public BookingDto updateBooking(Long id, BookingDto bookingDto) {
		Booking existingBooking = bookingRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));

		// Update fields
		existingBooking.setPrice(bookingDto.getPrice());
		existingBooking.setStatus(bookingDto.getStatus());
		// Ensure this is part of Booking entity

		Booking updatedBooking = bookingRepository.save(existingBooking);
		return modelMapper.map(updatedBooking, BookingDto.class);
	}

	@Override
	public void deleteBooking(Long id) {
		Booking booking = bookingRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));
		bookingRepository.delete(booking);
	}

	@Override
	public List<BookingDto> getAllBookings() {
		List<Booking> bookings = bookingRepository.findAll();
		return bookings.stream().map(booking -> modelMapper.map(booking, BookingDto.class))
				.collect(Collectors.toList());
	}
}
