package com.itachallenge.challenge.controllers;

import com.itachallenge.challenge.dtos.FilterDtoI;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ChallengeControllerI {

    //service injected

    /*
    relative path to microservice = "/itachallenge/api/v1/challenge"
    relative path to resource  = /challenges

     */


    //path to resource + /filters
    Mono<List<FilterDtoI>> getFilters();
}
