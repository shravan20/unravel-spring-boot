package com.example.UnravelSpringBoot.UserService;


import com.example.UnravelSpringBoot.UserEntity.UserModel;

import java.util.List;

public interface UserService {
    public UserModel addNewUser(UserModel user);
    public List<UserModel> getAllUsers();
}
