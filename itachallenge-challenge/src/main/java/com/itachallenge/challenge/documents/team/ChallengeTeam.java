package com.itachallenge.challenge.documents.team;

import com.itachallenge.challenge.documents.dummies.LanguageDummy;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

/*
estado doing:
responsabilidad: obvia
@Document
 */
public interface ChallengeTeam {

    /*
    all args constructor
     */

    /*
    doing
    method name provisional?
     */
    UUID getUuid();

    /*
    doing
     */
    String getLevel();

    /*
    doing
     */
    String getTitle();

    /*
    doing
     */
    Set<LanguageDummy> getLanguages();

    /*
    doing
    TODO: modificar la clase devuelta
     */
    LocalDate getCreationDate();

    /*
    IMPORTANTE:
    Habrá más campos -> más getters
    Están en estado doing
    Se irán añadiendo on demand
     */
}
