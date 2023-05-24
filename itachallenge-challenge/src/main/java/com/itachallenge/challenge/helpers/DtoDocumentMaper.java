package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.documents.ChallengeI;
import com.itachallenge.challenge.documents.SolutionI;
import com.itachallenge.challenge.dtos.ChallengeBasicDto;
import com.itachallenge.challenge.dtos.ChallengeDto;
import com.itachallenge.challenge.dtos.ResourceDto;
import com.itachallenge.challenge.dtos.SolutionDto;

import java.util.List;
import java.util.UUID;

public class DtoDocumentMaper implements DtoDocumentMapperI{

    @Override
    public ChallengeDto toFullDto(ChallengeI document, List<ResourceDto> resources) {

        ChallengeDto onlyWithBasic = toDtoWithOnlyBasic(document);
        onlyWithBasic.setDetail(document.getDetail());
        onlyWithBasic.setRelateds(document.getRelateds());
        onlyWithBasic.setResources(resources);
        onlyWithBasic.setSolutions(document.getSolutions().stream().map(this::toDto).toList());

        return null;
    }

    @Override
    public ChallengeDto toDtoWithOnlyBasic(ChallengeI document) {
        //init basic dto

        ChallengeBasicDto basic = ChallengeBasicDto.builder()
                .challenge_title(document.getChallenge_title())
                //TODO ADD MORE
                .build();

        return ChallengeDto.builder()
                .id_challenge(document.getId_challenge())
                .basicInfo(basic)
                .build();
    }

    private SolutionDto toDto (SolutionI solutionDoc){
        return null;
    }
}
