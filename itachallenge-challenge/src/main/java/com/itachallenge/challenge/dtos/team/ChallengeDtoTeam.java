package com.itachallenge.challenge.dtos.team;

import java.util.UUID;

/*
Estado: doing

Responsabilidad:
serializar/deserializar a/des de jsons toda la info de un reto

Importante:
A) instanciar según builder
B) Resto de dtos/campos listos y funcionando. Solo faltan los tests. Se irán añadiendo "on demand"

Info:
Patrón builder:
teoria (15min): https://www.youtube.com/watch?v=aTaDchlUf3U&list=PLj2IVmcP-_QNae4kZpMNk-yz1cNFyuRqS&index=5&t=596s
práctica (9min): https://www.youtube.com/watch?v=mWxB7at5lzo&list=PLj2IVmcP-_QNae4kZpMNk-yz1cNFyuRqS&index=6
 */
public interface ChallengeDtoTeam {

    /*
    constructor privado con solo uuid como parametro
    -> instanciar según builder
     */

    /*
    private no args constructor, para la deserializacion
     */

    static ChallengeDtoBuilderTeam builder(UUID challengeId){
        return null; // para que compile
    }



    /*
    resto de campos y dtos están hechos
    solo faltan los tests
    se irán añadiendo bajo demanda
     */


    //clase interna que implementa el builder
    interface ChallengeDtoBuilderTeam{
        //implementa un builder standard que solo requiere empezar con el id
    }

    /*
    setters i getters no implementados (no necesarios para la deserializacion/serialización)
    incluir "on demand"
     */
}