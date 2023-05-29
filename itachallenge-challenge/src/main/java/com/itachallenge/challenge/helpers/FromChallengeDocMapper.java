package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.dtos.ChallengeDto;
import com.itachallenge.challenge.dtos.ResourceDto;

import java.util.List;

public interface FromChallengeDocMapper {

    ChallengeDto toChallengeDtoComplete(Float percentage, Integer popularity, List<ResourceDto> resourcesDtos);

    ChallengeDto toChallengeDtoWithOnlyBasic(Float percentage, Integer popularity);

}
