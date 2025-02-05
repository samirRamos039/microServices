package com.infraestructura.infraestructura.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.dominio.models.UserModel;
import com.infraestructura.infraestructura.entitys.userEntity;

public interface UserRepository extends ReactiveMongoRepository<userEntity, Long> {
    Optional<UserModel> findByUsername(String username);
}