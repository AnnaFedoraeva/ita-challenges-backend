package com.itachallenge.challenge.dtos.team;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

/*
Estado: doing

Responsabilidad:
serializar/deserializar a/des de jsons la información básica de un reto
    (= la que se tiene que mostrar "como si fuera un resumen")

Importante: instanciar según builder

Info:
Patrón builder:
teoria (15min): https://www.youtube.com/watch?v=aTaDchlUf3U&list=PLj2IVmcP-_QNae4kZpMNk-yz1cNFyuRqS&index=5&t=596s
práctica (9min): https://www.youtube.com/watch?v=mWxB7at5lzo&list=PLj2IVmcP-_QNae4kZpMNk-yz1cNFyuRqS&index=6
 */
public interface ChallengeBasicInfoDtoTeam {

    /*
    TODO: importante, tipo Date provisional
    atributo creation date está dando problemas debido
    al tema de UTC.
    Seria recomendable ignorar este atributo en los dummies,
    al menos hasta que se encuentre una solución viable
     */


    /*
    all args constructor privado -> instanciar según builder
     */

    /*
    no args constructor -> requerido para la deserialización
     */

    static ChallengeBasicInfoDtoBuilderTeam builder(){
        return null; // para que compile
    }

    /*
    De momento no poner getters ni setters porque:
        De momento la app no lo necesita -> no los vamos a usar -> no los queremos testear
        @Builder no los necesita
     */

    //clase interna que implementa el builder
    interface ChallengeBasicInfoDtoBuilderTeam{
        //implementa un builder standard
    }

    /*
    Necesitamos la anotacion @JsonProperty para modificar nombres camelCase a nombers X_Y
    Si solo se usa en algunos atributos: el objectMapper usado por Spring "desordena" el orden en el json
        (atributos con anotacion -> al final)
    Que el json esté desordenado NO es un problema para el FE (mientras el campo esté y puedan hacer getX  ya tiran...)
    Pero es un problema para nuestros tests.
    Solución:
        Opcion A) Usar anotación @JsonPropertyOrder
            Problema: verboso + nueva dependencia
                + si, por lo que sea, canviamos l'orden de los atributos, habrá que modificar el orden de los Strings
        Opcion B) Seguit usando anotación @JsonProperty en todos los tributos
            No añade nueva dependencia + campo index lo soluciona
                + fácil de modificar si canviamos el orden (solo hay que mirar el orden del index)
                    (además el valor de index es relativo, no hay que hacer sequencia, solo ordena segun
                    si el valor es "mayor o menor"
     */

    /*
    Añadido test para la deserialización (además del que ya había para la serialización)
    La creación de los dtos expected extraido de los métodos tests (ahora se crean en métodos static):
        De esta manera se evita duplicar codigo, y hace más fácil + homogeniza la creación de los dtos en todos los tests
     */

    /*
    PercentageSerializer eliminado:
    La inclusión de un test para la deserialización implicaba la creación de un PercentageDeserializer
    o de un nuevo dto.
    Como al final se decidió que en el dto mejot poner los "valores sin modificar, y luego FE ya los
    mostrará bonitos" (creation date). Pues que hagan lo mismo con el porcentage... y menos trabajo para nosotros
     */
}
