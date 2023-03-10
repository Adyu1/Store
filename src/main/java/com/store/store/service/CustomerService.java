package com.store.store.service;

import java.util.List;

import com.store.store.dto.CustomerDto;
import com.store.store.model.Customer;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<CustomerDto> getAllCustomers();
}
