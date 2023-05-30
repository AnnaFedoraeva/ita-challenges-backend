package com.itachallenge.challenge.config.team;

/*
Para inyectar data de properties y proporcionarselo a quien lo necesite
 */
public interface PropertiesConfigTeam {

    /*
    estado: en PR
    Carga TODA la data relacionada con los filtros a mostrar y
    devuelve un String en formato json con la data
     */
    String loadFiltersData();

    /*
    estado: en PR
    Carga TODA la data relacionada con las opciones de ordenamiento a mostrar y
    devuelve un String en formato json con la data
     */
    String loadSortData();

    //estado: en PR
    Integer getConnectionTimeout();

    //estado: en PR
    Integer getMaxBytesInMemory();
}
