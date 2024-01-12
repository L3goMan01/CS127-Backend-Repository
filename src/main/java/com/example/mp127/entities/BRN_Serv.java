package com.example.mp127.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "BRN_SERVICE")
public class BRN_Serv {

    @Id
    @ManyToOne
    @JoinColumn(name="BOOKING_ID")
    //change BRN to class name for Booking Reference Number Table
    private BRN bookingId;

    @Id
    @ManyToOne
    @JoinColumn(name="CHARGEDSERVICE_ID")
    //change ChargedServices to class name for Charged Services Table
    private ChargedServices chargedServiceId;


    public BRN_Serv(BRN bookingId, ChargedServices chargedServiceId) {
        this.bookingId = bookingId;
        this.chargedServiceId = chargedServiceId;
    }

    public BRN_Serv(Long bookingId, Long chargedServiceId) {
    }
}
