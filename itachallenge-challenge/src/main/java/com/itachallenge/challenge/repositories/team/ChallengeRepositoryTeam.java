package com.itachallenge.challenge.repositories.team;

import com.itachallenge.challenge.documents.dummies.ChallengeDummy;
import com.itachallenge.challenge.documents.team.ChallengeTeam;
import reactor.core.publisher.Flux;

/*
Estado: doing

Responsabilidad: obvia
 */
public interface ChallengeRepositoryTeam {

    /*
    Estado: doing
     */
    Flux<ChallengeDummy> findAll();
}
