package com.itachallenge.challenge.dtos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itachallenge.challenge.helpers.ResourceHelper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootApplication
public class ChallengeBasicInfoDtoTest {

    @Autowired
    private ObjectMapper mapper;

    private final String basicInfoChallengeV1JsonPath = "json/BasicInfoChallangeV1.json";
    private final String basicInfoChallengeV2JsonPath = "json/BasicInfoChallangeV2.json";

    private ChallengeBasicInfoDto challengeBasicInfoDto;

    @BeforeEach
    void setUp(){
        LanguageDto firstLanguage = LanguageDtoTest.buildLanguageDto(1, "Javascript");
        LanguageDto secondLanguage = LanguageDtoTest.buildLanguageDto(2, "Java");
        Set<LanguageDto> languages = LanguageDtoTest.buildSetLanguages(firstLanguage,secondLanguage);
        challengeBasicInfoDto = buildChallengeBasicInfoDto
                ("Sociis Industries", "EASY", 105, 23.58f,languages);
    }

    @Test
    @DisplayName("OK Serialization ChallengeBasicInfoDto test")
    @SneakyThrows({JsonProcessingException.class, IOException.class})
    void rightSerializationTest(){
        ChallengeBasicInfoDto dtoSerializable = challengeBasicInfoDto;
        System.out.println(dtoSerializable);
        String jsonResult = mapper
                .writer(new DefaultPrettyPrinter().withArrayIndenter(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE))
                .writeValueAsString(dtoSerializable);
        System.out.println(jsonResult);
        String jsonExpectedV1 = new ResourceHelper(basicInfoChallengeV1JsonPath).readResourceAsString();
        String jsonExpectedV2 = new ResourceHelper(basicInfoChallengeV2JsonPath).readResourceAsString();
        System.out.println(jsonExpectedV1);
        System.out.println(jsonExpectedV2);
        //order of languages in challenge's basic info doesn't matter
        Assertions.assertTrue(jsonResult.equals(jsonExpectedV1) || jsonResult.equals(jsonExpectedV2));
    }

    @Test
    @DisplayName("OK Deserialization ChallengeBasicInfoDto test")
    @SneakyThrows(IOException.class)
    void rightDeserializationTest(){
        String jsonDeserializable = new ResourceHelper(basicInfoChallengeV1JsonPath).readResourceAsString();
        ChallengeBasicInfoDto dtoResult = mapper.readValue(jsonDeserializable, ChallengeBasicInfoDto.class);
        //System.out.println(dtoResult);
        ChallengeBasicInfoDto dtoExpected = challengeBasicInfoDto;
        assertThat(dtoResult).usingRecursiveComparison().isEqualTo(dtoExpected);
    }

    static ChallengeBasicInfoDto buildChallengeBasicInfoDto
            (String title, String level, Integer popularity, Float percentage, Set<LanguageDto> languages){
        return ChallengeBasicInfoDto.builder()
                .title(title)
                .level(level)
                .popularity(popularity)
                .percentage(percentage)
                .languages(languages)
                .build();
    }

    /* Solventar tema Date del json salida
    @Test
    @SneakyThrows({JsonProcessingException.class, IOException.class})
    void assertCorrectSerialization(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss 'UTC' yyyy");

        ChallengeBasicInfoDto origin = ChallengeBasicInfoDto.builder()
                .title("Sociis Industries")
                .level("EASY")
                .creationDate(LocalDateTime.parse("Tue May 30 07:33:43 UTC 2023", formatter))
                .popularity(105)
                .languages(Set.of(new LanguageDto(1, "Javascript"), new LanguageDto(2, "Java")))
                .percentage(23f).build();

        String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(origin);
        String jsonExpected = new ResourceHelper("json/BasicInfoChallangeV1.json").readResourceAsString();
        Assertions.assertEquals(jsonExpected, jsonResult);

    }*/



}
