package com.example.mp127.service;

import com.example.mp127.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl {
    private final BookingRepository bookingRepository;
}
