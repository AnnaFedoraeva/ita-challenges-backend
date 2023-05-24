package com.itachallenge.challenge.dtos;

import com.itachallenge.challenge.documents.LanguageI;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Builder
public class ChallengeBasicDto {

    private String level;
    private String challenge_title;



    public String getLevel() {
        return null;
    }

    public String getChallenge_title() {
        return null;
    }


    public Set<LanguageI> getLanguages() {
        return null;
    }

    public String getUsername(){
        return null;
    }


    //0.3325 ->  "33,25 %"
    public String getPercentage(){
        return null;
    }

    public int getPopularity(){
        return 0;
    }


    public LocalDate getCreation_date() {
        return null;
    }
}
