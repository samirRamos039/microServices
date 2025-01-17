package com.infraestructura.infraestructura.repository;

import java.util.Optional;
import com.example.SpringMicroService.infraestructura.entity.UserEntity;
import com.example.SpringMicroService.infraestructura.repository.ReactifMongoRepository;
import com.example.SpringMicroService.infraestructura.model.UserModel;

public interface UserRepository extends ReactifMongoRepository<UserEntity, Integer> {
    Optional<UserModel> findByUsername(String username);
}