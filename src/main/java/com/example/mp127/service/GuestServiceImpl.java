package com.example.mp127.service;

import com.example.mp127.entities.Guest;
import com.example.mp127.entities.request.addNewGuestRequest;
import com.example.mp127.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService{
    private final GuestRepository guestRepository;
    @Override
    public List<Guest> getAllGuests() {return guestRepository.findAll(); }

    @Override
    public Guest getGuestDetailsById(Long guestId) {
        return guestRepository.findByguestId(guestId);
    }

    @Override
    public List<Guest> getGuestDetailsBySurname(String lastName){
        return guestRepository.findAllByGuestSurname(lastName);
    }

    @Override
    public Guest updateGuestDetails(Long guestId, Guest updateGuestData)
    {
        Guest guestToUpdate = guestRepository.findByguestId(guestId);

        if(updateGuestData.getGuestId() != null)
        {
            guestToUpdate.setGuestId(updateGuestData.getGuestId());
        }
        if(updateGuestData.getFirstName() != null)
        {
            guestToUpdate.setFirstName(updateGuestData.getFirstName());
        }
        if(updateGuestData.getMiddleName() != null)
        {
            guestToUpdate.setMiddleName(updateGuestData.getMiddleName());
        }
        if(updateGuestData.getLastName() != null)
        {
            guestToUpdate.setLastName(updateGuestData.getLastName());
        }
        if(updateGuestData.getBirthday() != null)
        {
            guestToUpdate.setBirthday(updateGuestData.getBirthday());
        }
        if(updateGuestData.getAge() != null)
        {
            guestToUpdate.setAge(updateGuestData.getAge());
        }
        if(updateGuestData.getAddress() != null)
        {
            guestToUpdate.setAddress(updateGuestData.getAddress());
        }
        if(updateGuestData.getContactNo() != null)
        {
            guestToUpdate.setContactNo(updateGuestData.getContactNo());
        }
        if(updateGuestData.getEmail() != null)
        {
            guestToUpdate.setEmail(updateGuestData.getEmail());
        }

        return guestRepository.save(guestToUpdate);
    }

    @Override
    public Guest addNewGuest(addNewGuestRequest guestToAdd) {
        return guestRepository.save(guestToAdd.mapToGuest());
    }

    @Override
    public void deleteGuest(Long guestId) {
        Guest guestToDelete = guestRepository.findByguestId(guestId);
        if(guestToDelete != null)
        {
            guestRepository.delete(guestToDelete);
        }
        else {
            throw new RuntimeException("Guest with ID " + guestId + " not found");
        }
    }
}
