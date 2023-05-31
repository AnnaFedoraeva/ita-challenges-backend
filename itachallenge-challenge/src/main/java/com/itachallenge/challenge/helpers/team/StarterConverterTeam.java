package com.itachallenge.challenge.helpers.team;

import com.itachallenge.challenge.documents.dummies.ChallengeDummy;

/*
Estado: doing

Responsabilidad:
Indicar al ChallengeConverter qué objeto hay que convertir y
dar al cliente acceso a los métodos disponibles según la clase de partida.
 */
public interface StarterConverterTeam {

    /*
    Estado: done (falta test)

    Qué hace:
    como se indica que se quiere convertir un challenge document,
    entonces devuelve una interfaç, que da acceso a distintos métodos
    para indicar a que tipo de dto hay que mapearlo.
     */
    ChallengeDocConverterTeam from(ChallengeDummy challenge);

    /*
    Se podrá hacer sobrecarga de este método, devolviendo una nueva interfaç
    ej: SolutionDocConverter from(Solution solution);

    También si el objeto a convertir es un dto
    ej: DetailDtoConverter from(DetailDto detailDto);
     */

}
