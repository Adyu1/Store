package com.store.store.service;
import java.util.List;

import com.store.store.model.Customer;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public static List<Customer> getAllCustomers() {
       
        return null;
    }   
    
}
