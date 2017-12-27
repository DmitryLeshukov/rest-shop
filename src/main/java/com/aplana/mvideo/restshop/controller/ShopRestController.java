package com.aplana.mvideo.restshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShopRestController {

    @GetMapping("/get/something")
    public List<Object> findAll() {
        return new ArrayList<Object>();
    }

    @PostMapping("/get/something")
    public ResponseEntity create(@RequestBody Object testObject) {
        return  ResponseEntity.ok().body("Everything ok!");
    }
}
