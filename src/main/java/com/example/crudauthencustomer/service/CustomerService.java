package com.example.crudauthencustomer.service;

import com.example.crudauthencustomer.Models.Customer;

import java.util.List;
import java.util.Set;

public interface CustomerService {
    public List<Customer> findAll();

    public Customer findById(int theId);

    public void save(Customer theEmployee);

    public void deletebyId(int theId);
}
