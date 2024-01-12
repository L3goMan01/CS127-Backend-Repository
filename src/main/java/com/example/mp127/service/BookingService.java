package com.example.mp127.service;

import com.example.mp127.entities.Booking;
import com.example.mp127.entities.request.AddBookingRequest;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking addBooking(AddBookingRequest booking);
    Booking getBooking(Long id);
}
