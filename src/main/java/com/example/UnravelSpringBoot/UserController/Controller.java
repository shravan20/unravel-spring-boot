package com.example.UnravelSpringBoot.UserController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {

    @GetMapping("/status")
    public HashMap<String,Boolean> statusCheck(){
        HashMap<String, Boolean> status = new HashMap<String, Boolean>();
        status.put("Hello", true);
        return status;
    }

}