package com.codeclan.example.More_Than_U_Can_Chew.controllers;

import com.codeclan.example.More_Than_U_Can_Chew.models.Bakery;
import com.codeclan.example.More_Than_U_Can_Chew.models.BakeryItem;
import com.codeclan.example.More_Than_U_Can_Chew.models.Order;
import com.codeclan.example.More_Than_U_Can_Chew.models.User;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryItemRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.OrderRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    BakeryItemRepository bakeryItemRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BakeryRepository bakeryRepository;

    @GetMapping(value = "/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/orders/{id}")
    public ResponseEntity getOrder(@PathVariable Long id){
        return new ResponseEntity<>(orderRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/orders/users/{id}")
    public ResponseEntity getOrdersByUserId(@PathVariable Long id){
        return new ResponseEntity<>(orderRepository.findByUserId(id), HttpStatus.OK);
    }

    @PostMapping(value = "/orders")
    public ResponseEntity<Order> postOrder(@RequestBody Order order){
        BakeryItem bakeryItem = bakeryItemRepository.findById(order.getItemsOrdered().get(0).getId()).get();
        User orderUser = userRepository.findById(order.getUser().getId()).get();
        Bakery bakery = bakeryRepository.findById(order.getBakery().getId()).get();
        Order newOrder = new Order(bakery, orderUser, false);
        orderRepository.save(newOrder);
        bakeryItem.setOrder(newOrder);
        bakeryItemRepository.save(bakeryItem);
        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
    }

    @PatchMapping(value="/orders/{id}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order){
        orderRepository.save(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }



}
