package com.itachallenge.challenge.helpers;

import com.itachallenge.challenge.documents.*;
import com.itachallenge.challenge.dtos.*;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
// TODO: decidir si component o NO. En el service podría estar
//  como atributo haciendo el new (sin necesidad de inyectarlo)
public class DtoDocumentMapper {

    private ToDtoBuilder toDtoBuilder = new ToDtoBuilder();
    //TODO: implementar un ToDocumentBuilder y ponerlo aquí como atributo.

    /*
    Haciendo sobrecárga de este método (y del llamado) se
    puede adaptar el mapeo a dtos partiendo del documento que queramos de entrada.
     */
    public ToDtoBuilder startMappingToDtos(ChallengeI challengeDoc){
        return toDtoBuilder.startMappingToDtos(challengeDoc);
    }
}
