package com.example.crudauthencustomer.Models;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String first_name;
        private String last_name;
        private String email;
}
