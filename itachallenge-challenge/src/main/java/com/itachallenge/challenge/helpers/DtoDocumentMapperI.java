package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.documents.ChallengeI;
import com.itachallenge.challenge.dtos.ChallengeDto;

public interface DtoDocumentMapperI {

    /*
    DOC TO DTO: setear siempre id
     */

    /*
    Metodo setea tod o el document al dto (NO deja nada en null)
     */
    ChallengeDto toFullDto(ChallengeI document);

    /*
    Metodo setea solo basic info
     */
    ChallengeDto toDtoWithOnlyBasic(ChallengeI document);


}
