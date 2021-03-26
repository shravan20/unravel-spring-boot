package com.example.UnravelSpringBoot.UserService;


import com.example.UnravelSpringBoot.UserEntity.UserModel;

public interface UserService {
    public UserModel addNewUser(UserModel user);
    public UserModel getAllUsers();
}
