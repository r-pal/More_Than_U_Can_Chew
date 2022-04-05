package com.codeclan.example.More_Than_U_Can_Chew.repositories;

import com.codeclan.example.More_Than_U_Can_Chew.models.BakeryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BakeryItemRepository extends JpaRepository<BakeryItem, Long> {



}
