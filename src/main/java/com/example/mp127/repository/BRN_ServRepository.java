package com.example.mp127.repository;

import com.example.mp127.entities.BRN_Serv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRN_ServRepository extends JpaRepository<BRN_Serv, Long> {
}
