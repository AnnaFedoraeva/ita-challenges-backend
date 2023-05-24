package com.itachallenge.challenge.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itachallenge.challenge.documents.DetailI;
import com.itachallenge.challenge.documents.ExampleI;
import lombok.Getter;

import java.util.List;

//ONLY IMPLEMENTED FOR DESERIALIZATION.
//TODO: IMPLEMENT FOR SERIALIZATION WHEN NEEDED
@Getter
public class DetailDto{

    private String description;

    private List<ExampleDto> examples;

    @JsonProperty("notes")
    private String note;

    //use in mapping from document
    public DetailDto(String description, List<ExampleDto> examples, String note) {
        this.description = description;
        this.examples = examples;
        this.note = note;
    }
}
