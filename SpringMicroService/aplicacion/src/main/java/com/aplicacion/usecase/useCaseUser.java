package com.aplicacion.usecase;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import com.dominio.getawey.UserGetawey;
import com.dominio.models.UserModel;


@Service
public class useCaseUser  {

    private final UserGetawey userGetawey;

    public useCaseUser(UserGetawey userGetawey) {
        this.userGetawey = userGetawey;
    }

    public Mono<UserModel> saveUser(UserModel user) {
        return userGetawey.saveUsuario(user);
    }

    public Mono<UserModel> getUser() {
        return userGetawey.getUsuario();
    }
    
    public Mono<UserModel> getUserById(int id) {
        return userGetawey.gerUsuarioBiId(id);
    }

    public Mono<UserModel> updateUser(UserModel user) {
        return userGetawey.updateUsuario(user);
    }
    
    public Mono<UserModel> deleteUser(int id) {
        return userGetawey.deleteUsuario(id);
    }

}
