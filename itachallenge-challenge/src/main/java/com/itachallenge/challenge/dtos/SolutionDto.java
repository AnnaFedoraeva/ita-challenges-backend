package com.itachallenge.challenge.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.lang.Nullable;

import java.util.UUID;

/*
    Sección solucions
    A) Usuario no registrado -> FE NO muestra nada -> NO solicita nada
    B) Usuario registrado ->
            FE pregunta: get challneges/{id]/solutions pasando token o id usuario por parametro
            Nosotros miramos si usuario ha enviado ALGUNA solucion
                Caso Negativo) -> NO devolvemos soluciones a FE
                Caso Positivo)
                    SOLO enviamos al FE la soluciones del el/los lenguaje(s) de la(s) solucion(es)
                    enviadas por el usuario
*/

/*
Campos:
    Es muy probable que haya que añadir atributos a devolver a FE:
    Ej: fecha d'envio, id del usuario que la envió, nota, etc...
 */

//ONLY IMPLEMENTED FOR DESERIALIZATION.
//TODO: IMPLEMENT FOR SERIALIZATION WHEN NEEDED
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SolutionDto{

    @JsonProperty("id_solution")
    private UUID solutionId;

    /*
    acostumbrarse a pensar en terminos de "atributo code"
    -> las APIS que "validan codigo en formato String" usan este nombre
     */
    @JsonProperty("solution_text")
    private String code;

    @JsonProperty("id_language")
    private Integer technologyId;

    //use in mapping from document
    public SolutionDto(UUID solutionId, String code, @Nullable Integer technologyId) {
        this.solutionId = solutionId;
        this.code = code;
        this.technologyId = technologyId;
    }
}
