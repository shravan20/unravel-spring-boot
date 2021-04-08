package com.example.UnravelSpringBoot.Service;

import com.example.UnravelSpringBoot.Entity.AddressModel;

import java.util.List;

public interface AddressService {
    public AddressModel addAddress(AddressModel address);
    public List<AddressModel> getAddresses();
}
