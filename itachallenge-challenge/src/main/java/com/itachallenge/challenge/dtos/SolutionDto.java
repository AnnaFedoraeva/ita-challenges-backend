package com.itachallenge.challenge.dtos;

public class SolutionDto {

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
}
