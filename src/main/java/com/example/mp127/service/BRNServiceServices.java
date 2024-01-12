package com.example.mp127.service;

import com.example.mp127.entities.BRNServiceT;
import com.example.mp127.entities.request.addNewBRNServiceEntry;

public interface BRNServiceServices {
    BRNServiceT addNewBookingIDEntry(addNewBRNServiceEntry primaryKeys);
}
