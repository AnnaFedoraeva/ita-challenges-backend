package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.documents.*;
import com.itachallenge.challenge.dtos.ChallengeDto;
import com.itachallenge.challenge.dtos.ResourceDto;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
// TODO: decidir si component o NO. En el service podría estar
//  como atributo haciendo el new (sin necesidad de inyectarlo)
public class DtoDocumentMapper {

    private ToDtoBuilder toDtoBuilder = new ToDtoBuilder();
    //TODO: implementar un ToDocumentBuilder y ponerlo aquí como atributo.

    /*
    username, percentage, popularity, resources NO se almacenan en nuestra BD
    Se puede dejar en null/0 o poder valores de "mentirijilla"
     */
    public ChallengeDto toFullDto(ChallengeI challengeDoc,
                                  @Nullable String username, float percentage, int popularity,
                                  List<ResourceDto> resources){

        return customMappingToDtos(challengeDoc)
                .addBasicInfoDto(username,percentage,popularity)
                .addDetailDto()
                .addSolutionsDto()
                .addRelateds()
                .addResourcesDto(resources)
                .buildChallengeDto();
    }


    /*
    Metodo setea solo id + basic info
    username, percentage, popularity NO se almacenan en nuestra BD
    Se puede dejar en null/0 o poder valores de "mentirijilla"
     */
    public ChallengeDto toDtoWithOnlyBasic(ChallengeI challengeDoc,
                                           @Nullable String username, float percentage, int popularity){

        return customMappingToDtos(challengeDoc)
                .addBasicInfoDto(username,percentage,popularity)
                .buildChallengeDto();
    }

    /*
    Haciendo sobrecárga de este método (y del llamado) se
    puede adaptar el mapeo a dtos partiendo del documento que queramos de entrada.
     */
    public ToDtoBuilder customMappingToDtos(ChallengeI challengeDoc){
        return toDtoBuilder.startMappingToDtos(challengeDoc);
    }
}
