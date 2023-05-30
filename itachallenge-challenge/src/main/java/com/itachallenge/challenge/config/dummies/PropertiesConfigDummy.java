package com.itachallenge.challenge.config.dummies;

import com.itachallenge.challenge.config.team.PropertiesConfigTeam;
import org.springframework.stereotype.Component;

@Component //There's none bean declaration -> it's not a @Configuration
//Setters NOT needed. Values injected anyway (tested + ok)
public class PropertiesConfigDummy implements PropertiesConfigTeam {
    public String loadFiltersData() {
        return null;
    }

    public String loadSortData() {
        return null;
    }

    public Integer getConnectionTimeout() {
        return null;
    }

    public Integer getMaxBytesInMemory() {
        return null;
    }
}
