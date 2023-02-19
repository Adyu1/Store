package com.store.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.store.service.CustomerService;
import com.store.store.model.Customer;

@RestController
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping("/add")
    public String add(@RequestBody Customer customer){
        return "New customer added";
    }
    @GetMapping
    public List<Customer> gellAllCustomers(){
        return customerService.getAllCustomers();
    }

}
