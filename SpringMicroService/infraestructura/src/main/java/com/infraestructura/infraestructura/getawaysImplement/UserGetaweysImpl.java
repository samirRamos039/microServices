package com.infraestructura.infraestructura.getawaysImplement;

import com.dominio.getawey.UserGetawey;
import com.dominio.models.UserModel;

import reactor.core.publisher.Mono;

public class UserGetaweysImpl implements UserGetawey {

    @Override
    public Mono<UserModel> saveUsuario(UserModel usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'saveUsuario'");
    }

    @Override
    public Mono<UserModel> getUsuario() {
        throw new UnsupportedOperationException("Unimplemented method 'getUsuario'");
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
