package com.store.store.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.store.store.model.Customer;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer> {
    List<Customer> findAll();
}
