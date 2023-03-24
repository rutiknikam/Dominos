package com.example.dominos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pizza {
    @GetMapping("/mypizza")
    public String getData(){
        return "please purches pizza from dominos";
    }
}
