package com.itachallenge.challenge.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

//ONLY IMPLEMENTED FOR DESERIALIZATION.
//TODO: IMPLEMENT FOR SERIALIZATION WHEN NEEDED
@Getter
public class TechnologyDto {

    @JsonProperty("id_language")
    private int technologyId;
    @JsonProperty("language_name")
    private String technology;

    //use in mapping from document
    public TechnologyDto(int technologyId, String technologyName) {
        this.technologyId = technologyId;
        this.technology = technologyName;
    }
}
