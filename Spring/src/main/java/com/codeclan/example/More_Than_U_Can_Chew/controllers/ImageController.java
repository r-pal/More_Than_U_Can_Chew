package com.codeclan.example.More_Than_U_Can_Chew.controllers;

import com.codeclan.example.More_Than_U_Can_Chew.models.Image;
import com.codeclan.example.More_Than_U_Can_Chew.models.Order;
import com.codeclan.example.More_Than_U_Can_Chew.models.User;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    ImageRepository imageRepository;

    @GetMapping(value = "/images")
    public ResponseEntity<List<Image>> getAllImages(){
        return new ResponseEntity<>(imageRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/images/{id}")
    public ResponseEntity getImage(@PathVariable Long id){
        return new ResponseEntity<>(imageRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/images")
    public ResponseEntity<Image> postImage(@RequestBody Image image){
        imageRepository.save(image);
        return new ResponseEntity<>(image, HttpStatus.CREATED);
    }

    @PatchMapping(value="/images/{id}")
    public ResponseEntity<Image> updateImage(@RequestBody Image image){
        imageRepository.save(image);
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

    @DeleteMapping(value = "/images/{id}")
    public ResponseEntity<Long> deleteImage(@PathVariable Long id) {
        imageRepository.deleteById(id);
//        if (!isRemoved) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
