package com.itachallenge.challenge.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itachallenge.challenge.documents.ExampleI;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

//ONLY IMPLEMENTED FOR DESERIALIZATION.
//TODO: IMPLEMENT FOR SERIALIZATION WHEN NEEDED
@Getter
public class ExampleDto{

    @JsonProperty("id_example")
    private UUID exampleId;

    @JsonProperty("example_text")
    private String text;

    //use in mapping from document
    public ExampleDto(UUID exampleId, String text) {
        this.exampleId = exampleId;
        this.text = text;
    }
}
