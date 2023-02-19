package com.store.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.store.model.Customer;
import com.store.store.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer saveCustomer(Customer customer){
        return customer.saveCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    
}
