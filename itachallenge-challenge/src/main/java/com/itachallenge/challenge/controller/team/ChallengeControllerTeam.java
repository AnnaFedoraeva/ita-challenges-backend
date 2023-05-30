package com.itachallenge.challenge.controller.team;

import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Considerar clases Team como un sitio donde poder poner comentarios
Sirven para ver qué hay en develop + qué se está desarrolando y el estado de el desarrollo
NO usar en desarrollo (usar el dummy)
 */

@RestController
@RequestMapping(value = "/itachallenge/api/v1/challenge")
public abstract class ChallengeControllerTeam {

    /*
    Status: ON DEVELOP
     */
    protected static final Logger log = LoggerFactory.getLogger(ChallengeControllerTeam.class);

    /*
    Implementado por jonatan para hacer pruebas
    Status: ON DEVELOP
     */
    @Operation(summary = "Testing the App")
    @GetMapping(value = "/test")
    public String test(){
        log.info("** Saludos desde el logger **");
        return "Hello from ITA Challenge!!!";
    };
}
