package com.example.mp127.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name="BRN_ROOM")
public class BRNRoom {
    @Id
    private Long bookingId;

    private Long roomNumber;

    public BRNRoom(Long bookingId, Long roomNumber) {
        this.bookingId = bookingId;
        this.roomNumber = roomNumber;
    }
}
