package com.example.mp127.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity(name = "BRN_ROOM")
public class BRN_Room {
    @Id
    //"bookingId" should be the same name as the one in the BRN entity
    @MapsId("bookingId")
    //for the @Column(name="BOOKING_ID") tag in the BRN entity
    @JoinColumn(name="BOOKING_ID")
    //change BRN to entity name of BRN Table
    private BRN brnBookingId;

    @Id
    //"bookingId" should be the same name as the one in the BRN entity
    @MapsId("roomNumber")
    //for the @Column(name="ROOM_NUMBER") tag in the Room entity
    @JoinColumn(name="ROOM_NUMBER")
    //change Room to entity name of Room Table
    private Room roomNumber;

}
