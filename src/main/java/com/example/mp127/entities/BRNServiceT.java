package com.example.mp127.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity(name = "BRN_SERVICE")
public class BRNServiceT {

    @Id
    private Long bookingId;

    private Long chargedServicesId;


    public BRNServiceT(Long bookingId, Long chargedServicesId) {
        this.bookingId = bookingId;
        this.chargedServicesId = chargedServicesId;
    }

}
