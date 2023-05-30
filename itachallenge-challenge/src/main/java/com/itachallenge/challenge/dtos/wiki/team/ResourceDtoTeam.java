package com.itachallenge.challenge.dtos.wiki.team;

import com.itachallenge.challenge.dtos.wiki.dummies.TopicDtoDummy;
import com.itachallenge.challenge.dtos.wiki.dummies.UserResourceDtoDummy;

import java.util.List;

/*
Estado: en PR

Responsabilidad:
Mapear posible json en la respuesta de ita-wiki y rebotarla al front

Importante: tipos devueltos son provisionales. A modificar según necesidad.
 */
public interface ResourceDtoTeam {

    String getId();

    String getTitle();

    String getSlug();

    String getDescription();

    String getUrl();

    String getResourceType();

    String getCreatedAt();

    String getUpdatedAt();

    UserResourceDtoTeam getUser();

    //devuelve la list de dummies para que así el Resource dummy compile
    List<TopicDtoDummy> getTopics();
}
