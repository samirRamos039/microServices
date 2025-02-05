package com.infraestructura.infraestructura.getawaysImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dominio.getawey.UserGetawey;
import com.dominio.models.UserModel;
import com.infraestructura.infraestructura.entitys.userEntity;
import com.infraestructura.infraestructura.mapper.UsuarioMapper;
import com.infraestructura.infraestructura.repository.UserRepository;

import reactor.core.publisher.Mono;
@Repository
public class UserGetaweysImpl implements UserGetawey {
    
    @Autowired
    private UserRepository userRepository;


    @Override
    public Mono<UserModel> saveUsuario(UserModel usuario) {
        return userRepository.save(UsuarioMapper.toCollection(usuario))
                             .map(collection -> UsuarioMapper.toModel(collection));
    }
   

    @Override
    public Mono<UserModel> getUsuario() {
        Mono<userEntity> Entity = userRepository.findAll().next();
        return Entity.map(userEntity -> UsuarioMapper.toModel(userEntity));
                             
    }

    @Override
    public Mono<UserModel> updateUsuario(UserModel usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'updateUsuario'");
    }

    @Override
    public Mono<UserModel> gerUsuarioBiId(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'gerUsuarioBiId'");
    }

    @Override
    public Mono<UserModel> deleteUsuario(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteUsuario'");
    }

    
    
}
