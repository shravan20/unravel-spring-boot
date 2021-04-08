package com.example.UnravelSpringBoot.Repository;

import com.example.UnravelSpringBoot.Entity.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AddressRepository extends JpaRepository<AddressModel, Integer> {

    @Query(value= "select * from AddressModel", nativeQuery = true)
    public List<AddressModel> fetchAddresses();
}
