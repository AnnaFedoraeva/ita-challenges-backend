package com.itachallenge.challenge.helpers.team;

import com.itachallenge.challenge.dtos.dummies.ChallengeDtoDummy;

/*
Estado: doing

Responsabilidad:
Dar acceso (a los clientes que soliciten convertir des de un challenge document)
a las conversiones a dtos disponibles
 */
public interface ChallengeDocConverterTeam {

    /*
    Estado: doing (falta test)
    Convierte el Challenge document en un ChallengeDto con solo el id + la basic info
    Hay que proporcionat el porcentaje y la popularidad/favs (aunque se pueden passar como null)
     */
    ChallengeDtoDummy toChallengeDtoWithOnlyBasicInfo(Float percentage, Integer popularity);

    /*
    método toChallengeDto {data al 100%} listo, solo falta testing
    se añadirá "on demand"
     */
}
