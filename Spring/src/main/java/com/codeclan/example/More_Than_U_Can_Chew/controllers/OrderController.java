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

//    @PostMapping(value = "/orders")
//    public ResponseEntity<Order> postOrder(@RequestBody Order order){
//        BakeryItem item = bakeryItemRepository.findById(order.getItemsOrdered()[0].id);
//        User orderUser = userRepository.findById(data.userId);
//        Bakery bakery = bakeryRepository.findById(data.bakeryId);
//        Order newOrder = new Order(bakery, orderUser, false);
//        orderRepository.save(newOrder);
//        item.setOrder(newOrder);
//        orderRepository.save(newOrder);
//        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
//    }

    @PatchMapping(value="/orders/{id}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order){
        orderRepository.save(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

}
