package com.example.UnravelSpringBoot.Service;

import com.example.UnravelSpringBoot.Entity.AddressModel;
import com.example.UnravelSpringBoot.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImp implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressModel addAddress(AddressModel address) {
        return addressRepository.save(address);
    }

    @Override
    public List<AddressModel> getAddresses() {
        return addressRepository.fetchAddresses();
    }
}
