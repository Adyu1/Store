package com.store.store.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer;
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
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDto> customerDtos = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        
            for (Customer customer : customers) {
                customerDtos.add(modelMapper.map(customer, CustomerDto.class));
    }
    return customerDtos;
    }
}
