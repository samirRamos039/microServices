package com.infraestructura.infraestructura.mapper;

import org.modelmapper.ModelMapper;
import com.dominio.models.UserModel;
import com.infraestructura.infraestructura.entitys.userEntity;

public class UsuarioMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static UserModel toModel(userEntity userEntity) {
        return modelMapper.map(userEntity, UserModel.class);
    }

    public static userEntity toCollection(UserModel usuario) {
        return modelMapper.map(usuario, userEntity.class);
    }
}

