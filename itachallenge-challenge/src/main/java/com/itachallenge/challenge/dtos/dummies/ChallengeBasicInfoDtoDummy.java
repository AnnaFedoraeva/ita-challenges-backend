package com.itachallenge.challenge.dtos.dummies;

import com.itachallenge.challenge.dtos.team.ChallengeBasicInfoDtoTeam;
import com.itachallenge.challenge.dtos.team.LanguageDtoTeam;

import java.time.LocalDate;
import java.util.Set;

public class ChallengeBasicInfoDtoDummy implements ChallengeBasicInfoDtoTeam {

    static ChallengeBasicInfoDtoBuilderDummy builder(){
        return null;
    }

    public String getLevel() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public Set<LanguageDtoTeam> getLanguages() {
        return null;
    }

    public Float getPercentage() {
        return null;
    }

    public Integer getPopularity() {
        return null;
    }

    public LocalDate getCreationDate() {
        return null;
    }

    public static class ChallengeBasicInfoDtoBuilderDummy implements ChallengeBasicInfoDtoBuilderTeam{

    }
}
