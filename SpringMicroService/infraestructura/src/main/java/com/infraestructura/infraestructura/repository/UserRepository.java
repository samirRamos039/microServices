package com.infraestructura.infraestructura.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.dominio.models.UserModel;

public interface UserRepository extends ReactiveMongoRepository<UserModel, Integer> {
    Optional<UserModel> findByUsername(String username);
}