package com.example.SpringMicroService.infraestructura.entitys;

import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "users")
public class userEntity {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
}
