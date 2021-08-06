package com.example.crudauthencustomer.service;

import com.example.crudauthencustomer.Models.Customer;
import com.example.crudauthencustomer.dao.respository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private respository respository;

    @Override
    public List<Customer> listAll() {
        List<Customer> todos = new ArrayList<>();
        respository.findAll().forEach(todos::add);

        return todos;
    }

    public Customer Create(@RequestBody Customer Customer) {
       return respository.save(Customer);
    }

    @Override
    public Customer getById(Long id) {
        Customer cus = respository.getById(id);
        return cus;
    }

    @Override
    public Customer update(Long id, Customer theEmployee) {
        Customer customerFromDb = respository.findById(id).get();
        System.out.println(customerFromDb.toString());
        customerFromDb.setEmail(theEmployee.getEmail());
        customerFromDb.setFirst_name(theEmployee.getFirst_name());
        customerFromDb.setLast_name(theEmployee.getLast_name());
        return respository.save(customerFromDb);
    }

    @Override
    public Customer save(Customer theEmployee) {
        return respository.save(theEmployee);
    }

    @Override
    public void deletebyId(Long theId) {
        respository.deleteById(theId);
    }
}
