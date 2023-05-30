package com.itachallenge.challenge.services.team;

import reactor.core.publisher.Mono;

public interface ChallengeServiceTeam {

    /*
    Estado: PR
    devuelve un Mono<String> en formato json con la data
     */
    Mono<String> getFiltersInfo();

    /*
    Estado: PR
    devuelve un Mono<String> en formato json con la data
     */
    Mono<String> getSortInfo();
}
