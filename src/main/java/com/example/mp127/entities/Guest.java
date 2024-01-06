package com.example.mp127.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@RequiredArgsConstructor
@Entity(name="GUEST")
@Getter
@Setter
public class Guest {

    @Id
    @GeneratedValue(generator = "guest_seq_gen")
    @SequenceGenerator(name = "guest_seq_gen", sequenceName = "GUEST_SEQ", allocationSize = 1)
    private Long guestId;

    private String firstName;

    private String middleName;

    private String lastName;

    private LocalDate birthday;

    private Long age;

    private String address;

    private Long contactNo;

    private String email;

    public Guest(String firstName, String middleName, String lastName, LocalDate birthday,
                 Long age, String address, Long contactNo, String email) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
    }
}
