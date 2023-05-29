package com.itachallenge.challenge.services;

import com.itachallenge.challenge.documents.Challenge;
import com.itachallenge.challenge.dtos.ChallengeDto;
import com.itachallenge.challenge.dtos.ResourceDto;
import com.itachallenge.challenge.helpers.DtoDocumentMapper;

import java.util.List;

public class DemoUseConverterService {

    private DtoDocumentMapper converter;

    /**
     * 1) ya se ha obtenido previamente un challenge document
     *  En este método demo se usa un challenge document que se pasa por parámetro
     * 2) se le dice al objto converter que convierta X objeto
     *      el propio método que se invoca especifica el tipo de objeto
     *      se pasa el objeto a convertir como parametro
     * 3) una vez se ha invocado el método que identifica el "objeto fuente"
     *      se puede invocar distintos métodos
     *      los nombres especifican el tipo de "objeto destino" que se desea obtener
     *      los nombres especifican "como de completo" se desan los atributos del objeto de destino
     *      algunos de estos métodos pueden requerir que se proporcione data extra
     *          debido a que el "objeto fuente" no los tiene
     *
     */
    private void demo(Challenge challengeDoc){

        //ejemplo 1
        List<ResourceDto> resourcesFromItaWiki = null; //se obtienen del proxy
        Float percentageFromMicroUser = null; //se obtienen del proxy
        Integer popularityFromMicroUser = null; //se obtienen del proxy

        ChallengeDto challengeDto = converter.fromDocument(challengeDoc)
                .toChallengeDtoComplete(percentageFromMicroUser, popularityFromMicroUser, resourcesFromItaWiki);

    }
}
