package com.example.mp127.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@RequiredArgsConstructor
@Getter
@Setter
@Entity(name = "BOOKING_REFERENCE_NUMBER")
public class BRN_Temp {
    @Id
    private Long bookingId;

    private Long primaryGuest;
    private Long employeeId;
    private Date bookingDate;
    private Date checkInDate;
    private Date checkOutDate;
    private Long numberOfRooms;

    public BRN_Temp(Long bookingId, Long primaryGuest, Long employeeId, Date bookingDate, Date checkInDate, Date checkOutDate, Long numberOfRooms) {
        this.bookingId = bookingId;
        this.primaryGuest = primaryGuest;
        this.employeeId = employeeId;
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfRooms = numberOfRooms;
    }
}
