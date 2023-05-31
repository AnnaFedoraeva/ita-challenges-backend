package com.itachallenge.challenge.documents.dummies;

import com.itachallenge.challenge.documents.team.ChallengeTeam;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

//@Document(collection="challenges")
public class ChallengeDummy implements ChallengeTeam {
    public UUID getChallengeId() {
        return null;
    }

    public String getLevel() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public Set<LanguageDummy> getLanguages() {
        return null;
    }

    public LocalDate getCreationDate() {
        return null;
    }
}
