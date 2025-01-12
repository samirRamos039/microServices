package com.example.SpringMicroService.dominio.service;

import com.example.SpringMicroService.model.Usuario;
import reactor.core.publisher.Mono;

public interface userInterfaceServi {

     Mono<Usuario> saveUsuario(Usuario usuario);
     Mono<Usuario> getUsuario();
     Mono<Usuario> gerUsuarioBiId(int id);
     Mono<Usuario> deleteUsuario(int id);
    
}
