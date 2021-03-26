package com.example.UnravelSpringBoot.UserController;

import com.example.UnravelSpringBoot.UserEntity.UserModel;
import com.example.UnravelSpringBoot.UserService.UserService;
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

}