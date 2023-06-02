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
    all args constructor privado -> instanciar según builder
     */

    static ChallengeBasicInfoDtoBuilderTeam builder(){
        return null; // para que compile
    }

    String getLevel();

    String getTitle();

    Set<LanguageDtoTeam> getLanguages();

    Float getPercentage();

    Integer getPopularity();

    /*
    TODO: importante, tipo Date provisional
    atributo creation date está dando problemas debido
    al tema de UTC.
    Seria recomendable ignorar este atributo en los dummies,
    al menos hasta que se encuentre una solución viable
     */
    Date getCreationDate();

    /*
    setters privados, ya que ninguna clase lo necesita (de momento)
     */

    //clase interna que implementa el builder
    interface ChallengeBasicInfoDtoBuilderTeam{
        //implementa un builder standard
    }
}
