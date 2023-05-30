package com.itachallenge.challenge.dtos.dummies;

import com.itachallenge.challenge.dtos.team.ChallengeBasicInfoDtoTeam;
import com.itachallenge.challenge.dtos.team.ChallengeDtoTeam;

import java.util.UUID;

public class ChallengeDtoDummy implements ChallengeDtoTeam {

    static ChallengeDtoBuilderDummy builder(){
        return null;
    }

    public UUID getChallengeId() {
        return null;
    }

    public ChallengeBasicInfoDtoTeam getBasicInfo() {
        return null;
    }

    public static class ChallengeDtoBuilderDummy implements ChallengeDtoBuilderTeam{

    }
}
