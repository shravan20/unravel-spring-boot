package com.example.UnravelSpringBoot.UserController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/status")
    public String user(@RequestParam(value = "name", defaultValue = "World") String name){

        return "Hello" + name;
    }

}
