package com.dominio.models;

import lombok.Data;

@Data
public class UserModel {
    
    private Long id;
    private String name;
    private String email;
    private String password;
    
}
