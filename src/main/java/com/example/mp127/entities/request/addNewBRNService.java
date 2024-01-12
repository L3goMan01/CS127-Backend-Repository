package com.example.mp127.entities.request;

import com.example.mp127.entities.BRN_Serv;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class addNewBRNService {
    @JsonProperty
    private Long bookingId;

    @JsonProperty
    private Long chargedServiceId;

    public BRN_Serv mapToBRN_Serv(){
        return new BRN_Serv(this.bookingId, this.chargedServiceId);
    }
}
