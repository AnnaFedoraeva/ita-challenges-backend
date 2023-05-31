package com.itachallenge.challenge.helpers.dummies;

import com.itachallenge.challenge.documents.dummies.ChallengeDummy;
import com.itachallenge.challenge.dtos.dummies.ChallengeDtoDummy;
import org.springframework.stereotype.Component;

@Component
class CustomConverterDummy implements StarterConverterDummy, ChallengeDocConverterDummy {


    public ChallengeDocConverterDummy from(ChallengeDummy challenge) {
        return null;
    }


    public ChallengeDtoDummy toChallengeDtoWithOnlyBasicInfo(Float percentage, Integer popularity) {
        return null;
    }
}
