package com.example.crudauthencustomer.Controller;

import com.example.crudauthencustomer.Models.Customer;
import com.example.crudauthencustomer.service.CustomerService;
import com.example.crudauthencustomer.service.CustomerServiceImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CrudCustomerController {
    private CustomerService customerService;

    public CrudCustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Customer>> list() {
        List<Customer> Customers = customerService.listAll();
        return new ResponseEntity<>(Customers, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllTodos() {
        List<Customer> todos = customerService.listAll();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Customer> Create(@RequestBody Customer Customer) {
        Customer Customer1 = customerService.save(Customer);
        return new ResponseEntity<>(Customer1, HttpStatus.OK);
    }

    @DeleteMapping({"/{CusId}"})
    public ResponseEntity<String> deleteTodo(@PathVariable("CusId") Long CusId) {
        try {
            customerService.deletebyId(CusId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
            catch (Exception e) {
                return new ResponseEntity<>("Not find by id: " + e,HttpStatus.NO_CONTENT);
            }

    }
}
