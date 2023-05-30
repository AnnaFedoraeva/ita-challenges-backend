package com.itachallenge.challenge.config.team;

/*
Para inyectar data de properties y proporcionarselo a quien lo necesite
 */
public interface PropertiesConfigTeam {

    //estado: en PR
    Integer getConnectionTimeout();

    //estado: en PR
    Integer getMaxBytesInMemory();
}
