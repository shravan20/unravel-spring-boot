package com.example.UnravelSpringBoot.Service;
import com.example.UnravelSpringBoot.Entity.UserModel;
import java.util.List;
import java.util.Optional;


public interface UserService {
    public UserModel addNewUser(UserModel user);
    public List<UserModel> getAllUsers();
    public UserModel getUser(int userId);
}
