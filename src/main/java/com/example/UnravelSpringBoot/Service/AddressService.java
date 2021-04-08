package com.example.UnravelSpringBoot.Service;

import com.example.UnravelSpringBoot.Entity.AddressModel;

public interface AddressService {
    public AddressModel addAddress(String address);
    public AddressModel getAddresses();
}
