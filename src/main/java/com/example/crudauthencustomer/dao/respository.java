package com.example.crudauthencustomer.dao;

import com.example.crudauthencustomer.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface respository extends JpaRepository<Customer, Long> {
}
