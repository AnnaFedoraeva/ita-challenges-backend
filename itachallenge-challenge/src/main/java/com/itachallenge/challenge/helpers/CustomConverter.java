package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.documents.*;
import com.itachallenge.challenge.dtos.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomConverter implements DtoDocumentMapper, FromChallengeDocMapper{

    private Challenge challengeDoc;

    @Override
    public FromChallengeDocMapper fromDocument(Challenge challengeDoc) {
        this.challengeDoc = challengeDoc;
        return this;
    }


    @Override
    public ChallengeDto toChallengeDtoComplete(Float percentage, Integer popularity, List<ResourceDto> resourcesDtos){
        return fromChallengeToChallengeDto(percentage, popularity, resourcesDtos);
    }

    @Override
    public ChallengeDto toChallengeDtoWithOnlyBasic(Float percentage, Integer popularity) {
        return ChallengeDto.builder(challengeDoc.getUuid())
                .basicInfo(fromChallengeToChallengeBasicDto(percentage,popularity))
                .build();
    }


    private ChallengeDto fromChallengeToChallengeDto(Float percentage, Integer popularity, List<ResourceDto> resourcesDtos){
        return ChallengeDto.builder(challengeDoc.getUuid())
                .basicInfo(fromChallengeToChallengeBasicDto(percentage,popularity))
                .detail(fromDetailToDetailDto(challengeDoc.getDetail()))
                .solutions(challengeDoc.getSolutions().stream().map(this::fromSolutionToSolutionDto).toList())
                .relateds(challengeDoc.getRelateds())
                .resources(resourcesDtos)
                .build();
    }

    private ChallengeBasicDto fromChallengeToChallengeBasicDto(Float percentage, Integer popularity){
        return ChallengeBasicDto.builder()
                .level(challengeDoc.getLevel())
                .title(challengeDoc.getChallenge_title())
                .technologies(challengeDoc.getLanguages().stream()
                        .map(this::fromLanguageToLanguageDto).collect(Collectors.toSet()))
                .percentage(percentage)
                .popularity(popularity)
                .creationDate(challengeDoc.getCreation_date())
                .build();
    }

    private LanguageDto fromLanguageToLanguageDto(Language language) {
        return new LanguageDto(language.getId_language(), language.getLanguage_name());
    }

    private SolutionDto fromSolutionToSolutionDto(Solution solution){
        return new SolutionDto(solution.getId_solution(), solution.getSolution_text(), solution.getId_language());
    }

    private ExampleDto fromExampleToExampleDto(Example example) {
        return new ExampleDto(example.getId_example(), example.getExample_text());
    }

    private DetailDto fromDetailToDetailDto(Detail detail){
        List<ExampleDto> examplesDtos = detail.getExamples().stream()
                .map(this::fromExampleToExampleDto).toList();
        return new DetailDto(detail.getDescription(),examplesDtos,detail.getNote());
    }
}
