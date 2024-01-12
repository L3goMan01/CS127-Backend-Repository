package com.example.mp127.entities.request;

import com.example.mp127.entities.BRNServiceT;
import com.example.mp127.entities.Booking;
import com.example.mp127.entities.ChargedServicesT;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class addNewBRNServiceEntry {

    private Booking brnId;

    private ChargedServicesT csId;

    public BRNServiceT mapToBRNServices(){
        return new BRNServiceT(brnId.getBookingId(), csId.getChargedServicesId());
    }
}
