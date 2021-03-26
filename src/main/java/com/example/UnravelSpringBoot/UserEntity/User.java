package com.example.UnravelSpringBoot.UserEntity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import lombok.Generated;

@Getter
@Setter
@Entity
@Table(name="UserInfo")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;



}
