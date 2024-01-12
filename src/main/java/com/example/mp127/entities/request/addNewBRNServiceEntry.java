package com.example.mp127.entities.request;

import com.example.mp127.entities.BRNServiceT;
import com.example.mp127.entities.BRN_Temp;
import com.example.mp127.entities.ChargedServicesT;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MapsId;

public class addNewBRNServiceEntry {

    private BRN_Temp brnId;

    private ChargedServicesT csId;

    public BRNServiceT mapToBRNServices(){
        return new BRNServiceT(brnId.getBookingId(), csId.getChargedServicesId());
    }
}
