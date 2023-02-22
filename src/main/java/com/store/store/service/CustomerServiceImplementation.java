package com.store.store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.store.dto.CustomerDto;
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
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                        .map(customer -> modelMapper.map(customer, CustomerDto.class))
                        .collect(Collectors.toList());
    }
}
