package com.itachallenge.challenge.dtos;

import java.security.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public interface DatesSpecs {
    //Tue May 30 07:33:43 UTC 2023
    public default void x(){
        Date x;
        LocalDate m;
        Timestamp k;

        //date utils de apache commons  <-----

        System.out.println(System.getProperties()); //ver como está montado el sistema de java

        //import org.apache.commons.lang3.time.DateUtils;
    }
}
