package com.pro.controllers;

import com.pro.model.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class JsonController {
    @PostMapping(value = "/data", consumes = "application/json", produces = "application/json")
    Data postData(@RequestBody Data data){
        data.getInfo().setId(new Random().nextInt(Integer.MAX_VALUE));
        return data;
    }
}
