package com.example.mp127.controller;

import com.example.mp127.entities.Booking;
import com.example.mp127.entities.Employee;
import com.example.mp127.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/booking")
public class BookingController {
    private final BookingService bookingService;

    @GetMapping(path = "/all")
    public List<Booking> getAllEmployees() {
        return bookingService.getAllBookings();
    }
}
