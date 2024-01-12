package com.example.mp127.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity(name = "BRN_SERVICE")
public class BRN_Serv {

    @Id
    @MapsId("bookingId")
    @JoinColumn(name="BOOKING_ID")
    //change BRN to entity name of BRN Table
    private BRN brnBookingID;

    @Id
    @MapsId("chargedServicesId")
    @JoinColumn(name="CHARGEDSERVICE_ID")
    //Change ChargedServicesT to entity name of ChargedServices Table
    private ChargedServicesT chargedServicesID;

}
