package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.documents.ChallengeI;
import com.itachallenge.challenge.documents.SolutionI;
import com.itachallenge.challenge.dtos.ChallengeBasicDto;
import com.itachallenge.challenge.dtos.ChallengeDto;
import com.itachallenge.challenge.dtos.ResourceDto;
import com.itachallenge.challenge.dtos.SolutionDto;
import org.springframework.lang.Nullable;

import java.util.List;

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


    public ChallengeDto toDtoWithOnlyBasic(ChallengeI document,@Nullable String username
                        ,float percentage, int popularity) {
        //init basic dto

        ChallengeBasicDto basic = ChallengeBasicDto.builder()
                .level(document.getLevel())
                .title(document.getChallenge_title())
                .technologies(document.getLanguages())
                .username(username)
                .percentage(percentage)
                .popularity(popularity)
                .creationDate(document.getCreation_date())
                .build();

        return ChallengeDto.builder(document.getId_challenge())
                .basicInfo(basic)
                .build();
    }

    private SolutionDto toDto (SolutionI solutionDoc){
        return null;
    }
}
