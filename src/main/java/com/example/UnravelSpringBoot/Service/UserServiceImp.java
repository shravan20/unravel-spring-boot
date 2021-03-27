package com.example.UnravelSpringBoot.Service;

import com.example.UnravelSpringBoot.Entity.UserModel;
import com.example.UnravelSpringBoot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository UserRepo;

    @Override
    public UserModel addNewUser(UserModel user) {
        System.out.print("User:"+user);
        return UserRepo.save(user);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return UserRepo.findAll();
    }


    @Override
    public UserModel getUser(int userId) {
        Optional<UserModel> data = UserRepo.findById(userId);
        if(data.isPresent())
            return data.get();
        else
            return null;

    }

}