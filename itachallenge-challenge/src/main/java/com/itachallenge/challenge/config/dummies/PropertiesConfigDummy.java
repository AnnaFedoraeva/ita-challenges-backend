package com.itachallenge.challenge.config.dummies;

import com.itachallenge.challenge.config.team.PropertiesConfigTeam;
import org.springframework.stereotype.Component;

@Component //There's none bean declaration -> it's not a @Configuration
//Setters NOT needed. Values injected anyway (tested + ok)
public class PropertiesConfigDummy implements PropertiesConfigTeam {

    @Override
    public Integer getConnectionTimeout() {
        return null;
    }

    @Override
    public Integer getMaxBytesInMemory() {
        return null;
    }
}
