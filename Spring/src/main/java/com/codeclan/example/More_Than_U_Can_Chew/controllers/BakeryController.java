package com.codeclan.example.More_Than_U_Can_Chew.controllers;

import com.codeclan.example.More_Than_U_Can_Chew.models.Bakery;
import com.codeclan.example.More_Than_U_Can_Chew.models.Order;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BakeryController {

    @Autowired
    BakeryRepository bakeryRepository;

    @GetMapping(value = "/bakeries")
    public ResponseEntity<List<Bakery>> getAllBakeries(){
        return new ResponseEntity<>(bakeryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bakeries/{id}")
    public ResponseEntity getBakery(@PathVariable Long id){
        return new ResponseEntity<>(bakeryRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/bakeries")
    public ResponseEntity<Bakery> postBakery(@RequestBody Bakery bakery){
        bakeryRepository.save(bakery);
        return new ResponseEntity<>(bakery, HttpStatus.CREATED);
    }

    @PatchMapping(value="/bakeries/{id}")
    public ResponseEntity<Bakery> updateBakery(@RequestBody Bakery bakery){
        bakeryRepository.save(bakery);
        return new ResponseEntity<>(bakery, HttpStatus.OK);
    }

}
