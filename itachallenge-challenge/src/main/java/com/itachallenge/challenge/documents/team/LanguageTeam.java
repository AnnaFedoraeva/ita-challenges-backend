package com.itachallenge.challenge.documents.team;

import java.util.Set;
import java.util.UUID;

/*
estado doing:
responsabilidad: obvia
@Document
 */
public interface LanguageTeam {

    /*
    all args constructor
     */

    /*
    doing
    method name provisional?
     */
    int getIdLanguage();

    /*
    doing
    method name provisional?
     */
    String getLanguageName();

    /*
    doing
    method name provisional?
     */
    Set<UUID> getIdChallenges();
}
