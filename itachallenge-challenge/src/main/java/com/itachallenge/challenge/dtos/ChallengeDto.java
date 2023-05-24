package com.itachallenge.challenge.dtos;

import com.itachallenge.challenge.documents.ChallengeI;
import com.itachallenge.challenge.documents.DetailI;
import com.itachallenge.challenge.documents.LanguageI;
import com.itachallenge.challenge.documents.SolutionI;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class ChallengeDto {


    public UUID getId_challenge() {
        return null;
    }

    //basic info
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

    //end basic info
////////////////////////////////////////////


    public DetailI getDetail() {
        return null;
    }

    ///////////////////////////////////

    @Override
    public List<SolutionI> getSolutions() {
        return null;
    }

    @Override
    public Set<UUID> getRelateds() {
        return null;
    }

    @Override
    public Set<UUID> getTags() {
        return null;
    }
    /*




     */
}
