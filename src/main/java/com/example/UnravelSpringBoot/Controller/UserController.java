package com.example.UnravelSpringBoot.Controller;

import com.example.UnravelSpringBoot.Entity.UserModel;
import com.example.UnravelSpringBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/status")
    public HashMap<String,Boolean> statusCheck(){
        HashMap<String, Boolean> status = new HashMap<String, Boolean>();
        status.put("statusCheck", true);
        return status;
    }

    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody UserModel user){
        return new ResponseEntity<>(userService.addNewUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/user")
    public ResponseEntity getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    /*
    @GetMapping(value = "/user/{userId}")
    public UserModel getUser(@PathVariable int userId){
        return userService.getUser(userId);
    }*/


}