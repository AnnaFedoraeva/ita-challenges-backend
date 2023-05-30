package com.itachallenge.challenge.controller.team;

import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/*
Considerar clases Team como un sitio donde poder poner comentarios
Sirven para ver qué hay en develop + qué se está desarrolando y el estado de el desarrollo
NO usar en desarrollo (usar el dummy)
 */

@RestController
public abstract class ChallengeControllerTeam {

    /*
    Status: ON DEVELOP
     */
    protected static final Logger log = LoggerFactory.getLogger(ChallengeControllerTeam.class);

    /*
    Se ha solicitado en PR poder poner los paths como atributos public final.
    Así no hay que hacer copy paste de los paths en los tests.
     */


    /*
    Status: PR
    updating path
     */
    public abstract String test();

    public abstract Mono<String> getChallengesFilters();

    public abstract Mono<String> getChallengesSortInfo();
}
