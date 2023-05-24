package com.itachallenge.challenge.dtos;

import com.itachallenge.challenge.documents.SolutionI;

import java.util.UUID;

public class SolutionDto{

    public UUID getId_solution() {
        return null;
    }


    public String getSolution_text() {
        return null;
    }


    public int getId_language() {
        return 0;
    }

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
