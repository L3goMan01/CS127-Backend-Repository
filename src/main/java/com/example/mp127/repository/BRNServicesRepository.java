package com.example.mp127.repository;

import com.example.mp127.entities.BRNServiceT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRNServicesRepository extends JpaRepository<BRNServiceT, Long> {

}
