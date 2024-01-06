package com.example.mp127.service;

import com.example.mp127.entities.Guest;
import com.example.mp127.entities.request.addNewGuestRequest;

import java.util.List;

public interface GuestService {
    List<Guest> getAllGuests();

    Guest getGuestDetailsById(Long guestId);

    List<Guest> getGuestDetailsBySurname(String lastName);

    Guest updateGuestDetails(Long guestId, Guest updateGuestData);

    Guest addNewGuest(addNewGuestRequest guestToAdd);

    void deleteGuest(Long guestId);
}
