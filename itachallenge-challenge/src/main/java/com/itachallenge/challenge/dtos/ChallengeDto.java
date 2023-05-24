package com.itachallenge.challenge.dtos;

import lombok.Builder;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Builder
@Setter
public class ChallengeDto {

    private UUID id_challenge;
    private ChallengeBasicDto basicInfo;
    private DetailDto detail;
    private List<SolutionDto> solutions;
    private Set<UUID> relateds;
    private List<ResourceDto> resources;

    public ChallengeDto() {
    }

    public UUID getId_challenge() {
        return null;
    }

    /////////////////////////////////////////////
    //basic info

    public ChallengeBasicDto getBasicDetails(){
        return null;
    }

    //end basic info
////////////////////////////////////////////


    public DetailDto getDetail() {
        return null;
    }

    ///////////////////////////////////


    public List<SolutionDto> getSolutions() {
        return null;
    }

    ////////////////////////////////////


    public Set<UUID> getRelateds() {
        return null;
    }



    //////////////////////////////

    public List<ResourceDto> getResources() {
        return null;
    }

    ////////////////////////////////

    public void setRelateds(Set<UUID> relateds) {
        this.relateds = relateds;
    }
}
