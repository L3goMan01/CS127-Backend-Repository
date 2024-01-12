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
    private Long roomNumber;

    @Id
    private Long bookingId;

    public BRN_Room(Long roomNumber, Long bookingId) {
        this.roomNumber = roomNumber;
        this.bookingId = bookingId;
    }
}
