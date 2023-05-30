package com.itachallenge.challenge.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.itachallenge.challenge.helpers.PercentageSerializer;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Getter
//ONLY IMPLEMENTED FOR DESERIALIZATION.
//TODO: IMPLEMENT FOR SERIALIZATION WHEN NEEDED
public class ChallengeBasicDto {

    //TODO: Languages"" + CallengeBasicInfoDto

    private String level;

    @JsonProperty("challenge_title")
    private String title;

    @JsonProperty("languages")
    private Set<LanguageDto> languages;

    @JsonSerialize(using = PercentageSerializer.class)
    private Float percentage; //TODO: refactor field name once we know what exactly represents

    private Integer popularity;

    @JsonProperty("creation_date")
    //de momento se pasa la fecha como YYYY-MM-DD. Si FE no lo sabe convertir lo implementaremos nosotros
    //import org.apache.commons.lang3.time.DateUtils;
    //TODO: fix data-challenges.json
    private LocalDate creationDate;

    //PRIVATE NO ARGS CONSTRUCTOR: to force instantiation with @Builder
    private ChallengeBasicDto(String level, String title, Set<LanguageDto> languages,
                              float percentage, int popularity, LocalDate creationDate) {

        this.level = level;
        this.title = title;
        this.languages = languages;
        this.percentage = percentage;
        this.popularity = popularity;
        this.creationDate = creationDate;
    }

}
