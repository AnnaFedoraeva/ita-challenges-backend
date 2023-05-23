package com.itachallenge.challenge.services;

import com.itachallenge.challenge.dtos.FilterDtoI;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ChallengeServiceI {

    //challenge filters config injected

    Mono<List<FilterDtoI>> readFilters();
}
