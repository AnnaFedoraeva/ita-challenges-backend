package com.itachallenge.challenge.proxy.team;

import reactor.core.publisher.Mono;

/*
Estado: en PR

Responsabilidad:
Realizar peticiones a otras APIs

De momento solo implementado un método lo más genérico posible.
Más adelante se pueden añadir métodos para realizar peticiones
sin necesidad de pasarle la url y el tipo de dto esperado.
 */
public interface HttpProxyTeam {

    /*
    Estado: en PR
     */
    <T> Mono<T> getRequestData(String url, Class<T> clazz);
}
