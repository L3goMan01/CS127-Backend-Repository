package com.example.mp127.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@RequiredArgsConstructor
@Entity(name = "BOOKING_REFERENCE_NUMBER")
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(generator = "brn_seq_gen")
    @SequenceGenerator(name = "brn_seq_gen", sequenceName = "BRN_SEQ", allocationSize = 1)
    private Long bookingId;

    private Long primaryGuest;

    private Long employeeId;

    private Date bookingDate;

    private Date checkinDate;

    private Date checkoutDate;

    private Long numberOfRooms;

    public Booking(Long bookingId, Long primaryGuest, Long employeeId, Date bookingDate,
                   Date checkinDate, Date checkoutDate, Long numberOfRooms) {
        this.bookingId = bookingId;
        this.primaryGuest = primaryGuest;
        this.employeeId = employeeId;
        this.bookingDate = bookingDate;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.numberOfRooms = numberOfRooms;
    }
}
