package com.itachallenge.challenge.dtos.dummies;

import com.itachallenge.challenge.dtos.team.ChallengeBasicInfoDtoTeam;
import com.itachallenge.challenge.dtos.team.LanguageDtoTeam;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

public class ChallengeBasicInfoDtoDummy implements ChallengeBasicInfoDtoTeam {

    static ChallengeBasicInfoDtoBuilderDummy builder(){
        return null;
    }

    public static class ChallengeBasicInfoDtoBuilderDummy implements ChallengeBasicInfoDtoBuilderTeam{

    }
}
