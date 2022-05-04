package com.pro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HeaderController {
    @GetMapping("/headers")
    public String getHeaders(@RequestHeader Map<String, String> headers){
        String res = "";
        for(Map.Entry<String, String> pair : headers.entrySet()){
            res += pair.getKey() + "->" + pair.getValue() + "\n";
        }
        return res;
    }
}
