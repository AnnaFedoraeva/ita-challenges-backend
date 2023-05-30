package com.itachallenge.challenge.controller.dummies;

import com.itachallenge.challenge.controller.team.ChallengeControllerTeam;
import com.itachallenge.challenge.services.dummies.ChallengeServiceDummy;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

/*
Para poder usar lo que está en develop y a la vez poder usar/mockear lo que está
desarrollando otro compañero
 */

@RequestMapping(value = ChallengeControllerDummy.MICRO_CHALLENGE)
public class ChallengeControllerDummy extends ChallengeControllerTeam {

    public static final String MICRO_CHALLENGE = "/itachallenge/api/v1/challenge";

    public static final String TEST = "/test";

    public static final String FILTERS = "/filters";

    public static final String SORT_OPTIONS = "/sortOptions";

    @Autowired
    public ChallengeControllerDummy(ChallengeServiceDummy challengeService) {

    }

    @Operation(summary = "Testing the App")
    @GetMapping(value = TEST)
    public String test(){
        log.info("** Saludos desde el logger **");
        return "Hello from ITA Challenge!!!";
    }

    @Operation(summary = "Filters available for challenges")
    @GetMapping(value = FILTERS)
    public Mono<String> getChallengesFilters() {
        return null;
    }

    @Operation(summary = "Sorting options available for challenges")
    @GetMapping(value = SORT_OPTIONS)
    public Mono<String> getChallengesSortInfo() {
        return null;
    }
}
