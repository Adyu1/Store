package com.store.store.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;
import com.store.store.dto.CustomerDto;
import com.store.store.model.Customer;
import com.store.store.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private ModelMapper modelMapper;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDto> customerDTOs = new ArrayList<>();

        for (Customer customer : customers) {
            CustomerDto customerDTO = modelMapper.map(customer, CustomerDto.class);
            customerDTOs.add(customerDTO);
        }

        return customerDTOs;
    }
}