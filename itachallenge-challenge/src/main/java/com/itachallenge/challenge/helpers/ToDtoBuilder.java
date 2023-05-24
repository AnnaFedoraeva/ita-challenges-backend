package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.documents.*;
import com.itachallenge.challenge.dtos.*;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;


//visible solo a nivel de paquete -> usar DtoDocumentMapper
class ToDtoBuilder {
    private ChallengeI challengeDoc;

    private ChallengeBasicDto challengeBasicDto;
    private DetailDto detailDto;
    private List<SolutionDto> solutionsDto;
    private Set<UUID> relateds;
    private List<ResourceDto> resourcesDto;

    //no args constructor con visibilidad de paquete
    ToDtoBuilder() {
    }

    public void reset(){
        challengeDoc = null;
        challengeBasicDto = null;
        detailDto = null;
        solutionsDto = null;
        relateds = null;
        resourcesDto = null;
    }

    public ToDtoBuilder startMappingToDtos(ChallengeI challengeDoc) {
        this.challengeDoc = challengeDoc;
        return this;
    }

    //args: info not stored in our DB
    public ToDtoBuilder addBasicInfoDto(String username, float percentage, int popularity){
        challengeBasicDto = toChallengeBasicDto(username, percentage, popularity);
        return this;
    }

    public ToDtoBuilder addDetailDto(){
        detailDto = toDetailDto(challengeDoc.getDetail());
        return this;
    }

    public ToDtoBuilder addSolutionsDto(){
        solutionsDto = challengeDoc.getSolutions().stream()
                .map(this::toSolutionDto).toList();
        return this;
    }

    public ToDtoBuilder addRelateds(){
        relateds = challengeDoc.getRelateds();
        return this;
    }

    public ToDtoBuilder addResourcesDto(List<ResourceDto> resources){
        this.resourcesDto = resources;
        return this;
    }

    //Si previamente no se ha hecho el .addX -> entonces ese campo será null
    public ChallengeDto buildChallengeDto(){
        return ChallengeDto.builder(challengeDoc.getId_challenge())
                .basicInfo(challengeBasicDto)
                .detail(detailDto)
                .solutions(solutionsDto)
                .relateds(relateds)
                .resources(resourcesDto)
                .build();
    }

    //Se podrían añadir otros métodos, como buildSolutionsDto() etc...


    //en cualquier momento, si es necesario pasar de un document Xdoc a un Ydto (sin
    //mapear necesitar mapear el challenge al completo): se puede poner el método necesario como public

    private ChallengeBasicDto toChallengeBasicDto(String username,float percentage, int popularity){

        return ChallengeBasicDto.builder()
                .level(challengeDoc.getLevel())
                .title(challengeDoc.getChallenge_title())
                .technologies(challengeDoc.getLanguages().stream()
                        .map(this::toTechnologyDto).collect(Collectors.toSet()))
                .username(username)
                .percentage(percentage)
                .popularity(popularity)
                .creationDate(challengeDoc.getCreation_date())
                .build();
    }

    private TechnologyDto toTechnologyDto(LanguageI languageDoc){
        return new TechnologyDto(languageDoc.getId_language(), languageDoc.getLanguage_name());
    }

    private DetailDto toDetailDto(DetailI detailDoc){
        List<ExampleDto> examplesDto = detailDoc.getExamples().stream()
                .map(this::toExampleDto).toList();
        return new DetailDto(detailDoc.getDescription(),examplesDto,detailDoc.getNote());
    }

    private ExampleDto toExampleDto(ExampleI exampleDoc){
        return new ExampleDto(exampleDoc.getId_example(), exampleDoc.getExample_text());
    }

    private SolutionDto toSolutionDto(SolutionI solutionDoc){
        return new SolutionDto(solutionDoc.getId_solution(),solutionDoc.getSolution_text(),solutionDoc.getId_language());
    }
}
