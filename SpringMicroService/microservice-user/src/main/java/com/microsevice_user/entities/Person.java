package com.microsevice_user.entities;

import lombok.Data;
import jakarta.persistence.Entity;

@Data
@Entity
public class Person {

    @Id()
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String role;
    private String Address;
    private String phone;

    
    
}
