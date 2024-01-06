package com.example.mp127.entities.request;

import com.example.mp127.entities.Guest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;


@RequiredArgsConstructor
public class addNewGuestRequest {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("lastName")
    private String lastName;


    @JsonProperty("birthday")
    private LocalDate birthday;

    @JsonProperty("age")
    private Long age;

    @JsonProperty("address")
    private String address;

    @JsonProperty("contactNo")
    private Long contactNo;

    @JsonProperty("email")
    private String email;

    public Guest mapToGuest()
    {
        return new Guest(this.firstName, this.middleName, this.lastName, this.birthday, this.age,
                this.address, this.contactNo, this.email);
    }
}
