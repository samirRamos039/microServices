package com.example.SpringMicroService.infraestructura.mapper;

import org.modelmapper.ModelMapper;

public class UsuarioMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static Usuario toModel(usuarioCollections usuarioCollections) {
        return modelMapper.map(usuarioCollections, Usuario.class);
    }

    public static usuarioCollections toCollection(Usuario usuario) {
        return modelMapper.map(usuario, usuarioCollections.class);
    }
}

