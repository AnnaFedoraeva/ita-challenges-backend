package com.itachallenge.challenge.documents;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Getter
@Setter
@Builder
public class Example{

    @MongoId
    private UUID id_example;

    private String example_text;

}
