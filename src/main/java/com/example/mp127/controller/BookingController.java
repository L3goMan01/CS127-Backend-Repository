package com.example.mp127.controller;

import com.example.mp127.entities.Booking;
import com.example.mp127.entities.Employee;
import com.example.mp127.entities.request.AddBookingRequest;
import com.example.mp127.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/add")
    public @ResponseBody Booking addBooking(@RequestBody AddBookingRequest booking) {
        return bookingService.addBooking(booking);
    }

    @GetMapping(path = "/find/{Id}")
    public Booking getBooking(@PathVariable Long Id) {
        return bookingService.getBooking(Id);
    }
}
