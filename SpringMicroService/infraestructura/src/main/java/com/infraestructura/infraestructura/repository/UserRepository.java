package com.infraestructura.infraestructura.repository;

import java.util.Optional;
import com.infraestructura.infraestructura.entitys.userEntity;

import com.dominio.models.UserModel;

public interface UserRepository extends ReactivMongoRepository<UserModel, Integer> {
    Optional<UserModel> findByUsername(String username);
}