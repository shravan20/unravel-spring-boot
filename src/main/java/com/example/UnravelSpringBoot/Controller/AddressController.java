package com.example.UnravelSpringBoot.Controller;


import com.example.UnravelSpringBoot.Entity.AddressModel;
import com.example.UnravelSpringBoot.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity addAddress(@RequestBody AddressModel address){
        System.out.println(address);
        return  new ResponseEntity<>(addressService.addAddress(address), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAddresses(){
        return new ResponseEntity<>(addressService.getAddresses(),HttpStatus.OK);
    }

}
