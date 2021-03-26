package com.example.UnravelSpringBoot.UserService;

import com.example.UnravelSpringBoot.UserEntity.UserModel;
import com.example.UnravelSpringBoot.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository UserRepo;

    @Override
    public UserModel addNewUser(UserModel user) {
        return UserRepo.save(user);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return UserRepo.findAll();
    }

}