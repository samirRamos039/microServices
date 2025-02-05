package com.infraestructura.infraestructura.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.infraestructura.infraestructura.handler.UsuarioHandler;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class UserRoute {

    @Bean
    public RouterFunction<ServerResponse> userRoutes(UsuarioHandler usuarioHandler) {
        return route(POST("/api/user/save"), usuarioHandler::saveUser)
              .andRoute(GET("/api/user/get"), usuarioHandler::getUser);
    
}
}