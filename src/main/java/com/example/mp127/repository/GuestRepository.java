package com.example.mp127.repository;

import com.example.mp127.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
    Guest findByguestId(Long guestId);
    @Query(
            value = "SELECT * FROM GUEST WHERE UPPER(LAST_NAME) = UPPER(?)",
            nativeQuery = true
    )
    List<Guest> findAllByGuestSurname(String lastName);
}
