package com.itachallenge.challenge.requisitos_info;

import java.security.Timestamp;
import java.time.LocalDate;
import java.util.Date;

//Tue May 30 07:33:43 UTC 2023
public interface DatesSpecifications {

    /*
    Requisitos para el la fecha de creación:

    1)
    Jonatan quiere este formato en json de salida
    Tue May 30 07:33:43 UTC 2023

    2)
    Nos ha dicho que en el dto usemos la clase Date

    3)
    Para los tests
        en resource tenemos un json
        uno de sus campos es una fecha que tiene el formato requerido (1)
        Entonces -> "lo que ha dicho del String de salida"
        leer el json + el valor guardarlo como String (será identico a (1))
        Apoyandonos con la clase SimpleDateFormat indicar el formato + crear un objeto que contenga la fecha (Date?)
        Entonces ->
        Montar el dto con ese objeto?
        Comprovar que al serializarse machea el json de salida?

    "lo que ha dicho para la entrada"
    usar Entrada: DateUtils or SimpleDateFormat

    Link recomendado por jonatan para comparar dates:
    https://mkyong.com/java/how-to-compare-dates-in-java/
     */

    /*
    Recomendación anterior:
    date utils de apache commons  <-----
     */
}

//System.out.println(System.getProperties()); //ver como está montado el sistema de java