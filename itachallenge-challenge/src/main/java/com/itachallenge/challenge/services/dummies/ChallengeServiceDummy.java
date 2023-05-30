package com.itachallenge.challenge.services.dummies;

import com.itachallenge.challenge.config.dummies.PropertiesConfigDummy;
import com.itachallenge.challenge.services.team.ChallengeServiceTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ChallengeServiceDummy implements ChallengeServiceTeam {

    @Autowired
    public ChallengeServiceDummy(PropertiesConfigDummy config) {

    }

    public Mono<String> getFiltersInfo() {
        return null;
    }

    public Mono<String> getSortInfo() {
        return null;
    }
}
