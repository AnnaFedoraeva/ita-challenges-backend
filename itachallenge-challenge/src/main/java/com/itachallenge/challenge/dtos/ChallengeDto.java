package com.itachallenge.challenge.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
//ONLY IMPLEMENTED FOR DESERIALIZATION.
//TODO: IMPLEMENT FOR SERIALIZATION WHEN NEEDED
public class ChallengeDto {

    //TODO relatedChallenges  !!!!

    @JsonProperty("id_challenge")
    private UUID challengeId;

    @JsonUnwrapped
    private ChallengeBasicDto basicInfo;

    @JsonProperty("details")
    private DetailDto detail;

    private List<SolutionDto> solutions;

    @JsonProperty("related")
    private Set<UUID> relatedChallenges; //uuids, para no embeber un(os) ChallengeDto (bucle casi infinito)

    private List<ResourceDto> resources;

    //PRIVATE: to force instantiation with custom builder
    private ChallengeDto(UUID challengeId) {
        this.challengeId = challengeId;
    }

    public static ChallengeDtoBuilder builder(UUID challengeId){
        return new ChallengeDtoBuilder(challengeId);
    }

    public static class ChallengeDtoBuilder{
        private ChallengeDto challenge;

        public ChallengeDtoBuilder(UUID id) {
            this.challenge = new ChallengeDto(id);
        }

        public ChallengeDtoBuilder basicInfo(ChallengeBasicDto basicInfo){
            challenge.setBasicInfo(basicInfo);
            return this;
        }

        public ChallengeDtoBuilder detail(DetailDto detail){
            challenge.setDetail(detail);
            return this;
        }

        public ChallengeDtoBuilder solutions(List<SolutionDto> solutions){
            challenge.setSolutions(solutions);
            return this;
        }

        public ChallengeDtoBuilder relateds(Set<UUID> relateds){
            challenge.setRelateds(relateds);
            return this;
        }

        public ChallengeDtoBuilder resources(List<ResourceDto> resources){
            challenge.setResources(resources);
            return this;
        }

        public ChallengeDto build(){
            return challenge;
        }
    }

    private void setBasicInfo(ChallengeBasicDto basicInfo) {
        this.basicInfo = basicInfo;
    }

    private void setDetail(DetailDto detail) {
        this.detail = detail;
    }

    private void setSolutions(List<SolutionDto> solutions) {
        this.solutions = solutions;
    }

    private void setRelateds(Set<UUID> relateds) {
        this.relateds = relateds;
    }

    private void setResources(List<ResourceDto> resources) {
        this.resources = resources;
    }
}
