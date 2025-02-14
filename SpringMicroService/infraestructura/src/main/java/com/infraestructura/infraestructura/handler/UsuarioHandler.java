package com.infraestructura.infraestructura.handler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.aplicacion.usecase.UseCaseUser;
import com.dominio.models.UserModel;
import reactor.core.publisher.Mono;

@Component
public class UsuarioHandler {

    private final UseCaseUser useCaseUser;
    
    @Autowired
    public UsuarioHandler(UseCaseUser useCaseUser) {
        this.useCaseUser = useCaseUser;
    }



   public Mono<ServerResponse> saveUser(ServerRequest request) {
        return request.bodyToMono(UserModel.class)
                      .flatMap(useCaseUser::saveUser)
                      .flatMap(user -> ServerResponse.ok().bodyValue(user))
                      .switchIfEmpty(ServerResponse.noContent().build())
                      .onErrorResume(error -> ServerResponse.badRequest().bodyValue(error.getMessage()));
                };
    
   public Mono<ServerResponse> getUser(ServerRequest request) {
        return useCaseUser.getUser()
                          .flatMap(user -> ServerResponse.ok().bodyValue(user))
                          .switchIfEmpty(ServerResponse.noContent().build())
                          .onErrorResume(error -> ServerResponse.badRequest().bodyValue(error.getMessage()));
                };             
}
