package com.dominio.getawey;

import com.dominio.models.UserModel;
import reactor.core.publisher.Mono;

public interface UserGetawey {

     Mono<UserModel> saveUsuario(UserModel usuario);
     Mono<UserModel> getUsuario();
     Mono<UserModel> gerUsuarioBiId(int id);
     Mono<UserModel> deleteUsuario(int id);
    
}
