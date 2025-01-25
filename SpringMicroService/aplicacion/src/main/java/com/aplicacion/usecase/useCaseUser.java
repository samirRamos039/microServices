package com.aplicacion.usecase;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import com.dominio.getawey.UserGetawey;
import com.dominio.models.UserModel;


@Service
public class useCaseUser implements UserGetawey {

    @Override
    public Mono<UserModel> saveUsuario(UserModel usuario) {
        return null;
    }

    @Override
    public Mono<UserModel> getUsuario() {
        return null;
    }

    @Override
    public Mono<UserModel> gerUsuarioBiId(int id) {
        return null;
    }

    @Override
    public Mono<UserModel> deleteUsuario(int id) {
        return null;
    }
    

}
