package com.example.SpringBootMicroService.infraestructura.usecase;

import org.springframework.stereotype.Service;
import com.example.SpringBootMicroService.infraestructura.service.userInterfaceServi;
import com.example.SpringBootMicroService.dominio.models.userModel;
import reactor.core.publisher.Mono;

@Service
public class useCaseUser {
    
    private final userInterfaceServi userInterfaceServi;

    public useCaseUser(userInterfaceServi userInterfaceServi) {
        this.userInterfaceServi = userInterfaceServi;
    }

    public Mono<userModel> saveUsuario(userModel usuario) {
        return userInterfaceServi.saveUsuario(usuario);
    }

    public Mono<userModel> getUsuario() {
        return userInterfaceServi.getUsuario();
    }

    public Mono<userModel> gerUsuarioBiId(int id) {
        return userInterfaceServi.gerUsuarioBiId(id);
    }

    public Mono<userModel> deleteUsuario(int id) {
        return userInterfaceServi.deleteUsuario(id);
    }

}
