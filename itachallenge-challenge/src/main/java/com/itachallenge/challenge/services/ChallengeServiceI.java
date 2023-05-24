package com.itachallenge.challenge.services;

import com.itachallenge.challenge.dtos.FilterDtoI;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ChallengeServiceI {

    //challenge filters config injected

    Mono<List<FilterDtoI>> readFilters();

    /*
    private Flux<?> demo(Flux<?> flux){

        //Pageable PageRequest
        //size
        //page [0,N]

        //limit = size
        //offset = page*size


    int offset =0;
    int limit = 0;

        return     repsotoryFindAll() //Flux<Ch>
                .sort() //si requiere ordenamiento y no se ha podido solicitar al repository
                .skip(offset)
                .take(limit)
                .map(toDto);

    }
    */
}
