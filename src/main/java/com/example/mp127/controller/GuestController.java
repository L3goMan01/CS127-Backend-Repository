package com.example.mp127.controller;

import com.example.mp127.entities.Guest;
import com.example.mp127.entities.request.addNewGuestRequest;
import com.example.mp127.entities.request.updateGuestRequest;
import com.example.mp127.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/guest")
public class GuestController {
    private final GuestService guestService;

    //Get list of all guests
    @GetMapping(path="/all")
    public List<Guest> getAllGuests() {return guestService.getAllGuests(); }

    //Get guest details via guest ID
    @GetMapping(path="/guestId/{guestId}")
    public Guest getGuestDetailsById(@PathVariable Long guestId) {return guestService.getGuestDetailsById(guestId); }

    //Case-insensitive query using lastname
    @GetMapping(path="/lastname/{lastName}")
    public List<Guest> getGuestDetailsBySurname(@PathVariable String lastName){
        return guestService.getGuestDetailsBySurname(lastName);
    }

    //Make new guest entry
    @PostMapping(path="/newGuest")
    public @ResponseBody Guest addNewGuest(@RequestBody addNewGuestRequest guestToAdd)
    {
        return guestService.addNewGuest(guestToAdd);
    }

    //Edit guest details via guest ID
    @PutMapping(path="/update/{guestId}")
    public Guest updateGuestDetails(@PathVariable Long guestId, @RequestBody updateGuestRequest update)
    {
        Guest updateGuestData = update.mapToGuest();
        return guestService.updateGuestDetails(guestId, updateGuestData);
    }

    //Delete guest entry
    @DeleteMapping(path="/delete/{guestId}")
    public ResponseEntity<Void> deleteGuest(@PathVariable Long guestId)
    {
        try{
            guestService.deleteGuest(guestId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
