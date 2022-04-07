package com.codeclan.example.More_Than_U_Can_Chew.controllers;

import com.codeclan.example.More_Than_U_Can_Chew.models.BakeryItem;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BakeryItemController {

    @Autowired
    BakeryItemRepository bakeryItemRepository;

    @GetMapping(value = "/bakeryItems")
    public ResponseEntity<List<BakeryItem>> getAllBakeryItems(){
        return new ResponseEntity<>(bakeryItemRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bakeryItems/{id}")
    public ResponseEntity getBakeryItems(@PathVariable Long id){
        return new ResponseEntity<>(bakeryItemRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/bakeryItems")
    public ResponseEntity<BakeryItem> postBakeryItem(@RequestBody BakeryItem bakeryItem){
        bakeryItemRepository.save(bakeryItem);
        return new ResponseEntity<>(bakeryItem, HttpStatus.CREATED);
    }

    @PatchMapping(value="/bakeryItems/{id}")
    public ResponseEntity<BakeryItem> updateBakeryItem(@RequestBody BakeryItem bakeryItem){
        bakeryItemRepository.save(bakeryItem);
        return new ResponseEntity<>(bakeryItem, HttpStatus.OK);
    }

    @GetMapping(value="/bakeryItems/orders/{id}")
    public ResponseEntity<List<BakeryItem>> getBakeryItemsByOrderId(@PathVariable Long id){
        return new ResponseEntity<>(bakeryItemRepository.findByOrderId(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/bakeryItems/{id}")
    public ResponseEntity<Long> deleteBakeryItem(@PathVariable Long id) {
        bakeryItemRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
