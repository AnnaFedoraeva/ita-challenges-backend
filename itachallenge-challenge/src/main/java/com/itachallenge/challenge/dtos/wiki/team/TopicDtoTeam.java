package com.itachallenge.challenge.dtos.wiki.team;

/*
Estado: en PR

Responsabilidad:
Mapear posible json en la respuesta de ita-wiki y rebotarla al front

Importante: tipos devueltos son provisionales. A modificar según necesidad.
 */
public interface TopicDtoTeam {

    String getId();

    String getName();

    String getSlug();

    String getCategoryId();

    String getCreatedAt();

    String getUpdatedAt();
}
