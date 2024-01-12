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
    //"bookingId" should be exactly the same name as the one in the BRN entity
    @MapsId("bookingId")
    //for the @Column(name="BOOKING_ID") tag in the BRN entity
    @JoinColumn(name="BOOKING_ID")
    //change BRN to entity name of BRN Table
    private BRN brnBookingID;

    @Id
    //"chargedServicesId" should be exactly the same name as the one in the ChargedServices entity
    @MapsId("chargedServicesId")
    //for the @Column(name="CHARGEDSERVICE_ID") tag in the ChargedServices entity
    @JoinColumn(name="CHARGEDSERVICE_ID")
    //Change ChargedServicesT to entity name of ChargedServices Table
    private ChargedServicesT chargedServicesID;

}
