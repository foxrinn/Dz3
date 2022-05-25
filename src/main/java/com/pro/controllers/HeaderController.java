package com.pro.controllers;

import com.pro.events.CustomSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HeaderController {

    @Autowired
    private CustomSpringEventPublisher customSpringEventPublisher;

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader Map<String, String> headers){
        String res = "";
        for(Map.Entry<String, String> pair : headers.entrySet()){
            res += pair.getKey() + "->" + pair.getValue() + "\n";
        }
        return res;
    }


    @GetMapping("/event")
    public void createEvent(){
        customSpringEventPublisher.publishCustomEvent("Santa Clause is going...");
    }
}
