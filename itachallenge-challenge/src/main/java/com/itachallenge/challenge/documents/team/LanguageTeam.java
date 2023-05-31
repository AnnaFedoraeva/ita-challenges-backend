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
    Extra info needed:
    Constructores??
    Setters??
     */

    /*
    doing
    method name provisional?
     */
    int getLanguageId();

    /*
    doing
    method name provisional?
     */
    String getLanguageName();

    /*
    doing
    method name provisional?
     */
    Set<UUID> getIdsChallenges();
}
