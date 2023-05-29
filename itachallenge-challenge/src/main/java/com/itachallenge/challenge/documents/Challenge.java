package com.itachallenge.challenge.documents;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Document(collection="challenges")
@Getter
@Setter
@Builder
public class Challenge{

    @MongoId
    @Field(name="id_challenge")
    private UUID uuid;

    private String level;   //valor seteado fom properties

    private String challenge_title;

    private Set<Language> languages;

    private LocalDate creation_date;

    private Detail detail;

    private List<Solution> solutions;

    private Set<UUID> relateds;

    private Set<UUID> tags;

}