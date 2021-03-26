package com.example.UnravelSpringBoot.Repository;

import com.example.UnravelSpringBoot.Entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserModel, Integer> {

}
