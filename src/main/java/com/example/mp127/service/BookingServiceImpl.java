package com.example.mp127.service;

import com.example.mp127.entities.Booking;
import com.example.mp127.entities.request.AddBookingRequest;
import com.example.mp127.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking addBooking(AddBookingRequest booking) {
        return bookingRepository.save(booking.mapToBooking());
    }

    @Override
    public Booking getBooking(Long id) {
        return bookingRepository.findByBookingId(id);
    }
}
