package com.itachallenge.challenge.dtos;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

/*
Como no sabemos al final qué vamos a necesitar ni
cómo nos va a dar ITA-WIKI el resource -> de momento se deja lo más general posible
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ResourceDto {

    private UUID id_resource;

    private String resource_description;

    private String author;

    private LocalDate generation_date;
}
