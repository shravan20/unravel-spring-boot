package com.example.UnravelSpringBoot.Controller;

import com.example.UnravelSpringBoot.Entity.UserModel;
import com.example.UnravelSpringBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public UserModel createUser(@RequestBody UserModel user){
        return userService.addNewUser(user);
    }

    @GetMapping("/user")
    public List<UserModel> getAllUsers(){

        return userService.getAllUsers();
    }

    /*
    @GetMapping(value = "/user/{userId}")
    public UserModel getUser(@PathVariable int userId){
        return userService.getUser(userId);
    }*/


}