package com.itachallenge.challenge.helpers.dummies;

import com.itachallenge.challenge.helpers.team.ResourceHelperTeam;

import java.io.IOException;

public class ResourceHelperDummy implements ResourceHelperTeam {

    public ResourceHelperDummy(String resourcePath) {
    }

    public String readResourceAsString() throws IOException {
        return null;
    }

    public <T> T mapResourceToObject(Class<T> targetClass) throws IOException{
        return null;
    }
}
