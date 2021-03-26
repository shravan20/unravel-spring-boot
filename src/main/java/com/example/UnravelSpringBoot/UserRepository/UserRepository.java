package com.example.UnravelSpringBoot.UserRepository;

import com.example.UnravelSpringBoot.UserEntity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserModel, Integer> {

}
