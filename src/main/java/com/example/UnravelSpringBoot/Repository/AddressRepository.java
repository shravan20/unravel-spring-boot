package com.example.UnravelSpringBoot.Repository;

import com.example.UnravelSpringBoot.Entity.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<AddressModel, Integer> {

}
