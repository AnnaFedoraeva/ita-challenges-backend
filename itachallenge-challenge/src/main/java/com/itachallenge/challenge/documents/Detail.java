package com.itachallenge.challenge.documents;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Detail{

    private String description;

    private List<Example> examples;

    private String note;

}
