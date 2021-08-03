package com.example.crudauthencustomer.service;

import com.example.crudauthencustomer.Models.Customer;

import java.util.List;
import java.util.Set;
public interface CustomerService {
    public List<Customer> listAll();

    public Customer Create(Customer theEmployee);

    public Customer getById(Long id);

    public Customer save(Customer theEmployee);

    public void deletebyId(Long theId);
}
