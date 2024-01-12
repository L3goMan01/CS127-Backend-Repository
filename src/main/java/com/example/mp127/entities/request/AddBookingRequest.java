package com.example.mp127.entities.request;

import com.example.mp127.entities.Booking;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
public class AddBookingRequest {
    @JsonProperty("bookingId")
    private Long bookingId;

    @JsonProperty("primaryGuest")
    private Long primaryGuest;

    @JsonProperty("employeeId")
    private Long employeeId;

    @JsonProperty("bookingDate")
    private Date bookingDate;

    @JsonProperty("checkinDate")
    private Date checkinDate;

    @JsonProperty("checkoutDate")
    private Date checkoutDate;

    @JsonProperty("numberOfRooms")
    private Long numberOfRooms;

    public Booking mapToBooking() {
        return new Booking(
                bookingId,primaryGuest,employeeId,bookingDate,checkinDate,checkoutDate,numberOfRooms
        );
    }
}
