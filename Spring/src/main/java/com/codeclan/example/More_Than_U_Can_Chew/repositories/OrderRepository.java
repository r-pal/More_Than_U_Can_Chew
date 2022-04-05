package com.codeclan.example.More_Than_U_Can_Chew.repositories;

import com.codeclan.example.More_Than_U_Can_Chew.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserId(Long id);
}
