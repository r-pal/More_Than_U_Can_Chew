package com.codeclan.example.More_Than_U_Can_Chew.repositories;

import com.codeclan.example.More_Than_U_Can_Chew.models.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery, Long> {
}
