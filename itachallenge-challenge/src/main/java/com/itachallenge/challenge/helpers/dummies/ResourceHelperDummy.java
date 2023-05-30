package com.itachallenge.challenge.helpers.dummies;

import com.itachallenge.challenge.helpers.team.ResourceHelperTeam;

import java.io.IOException;

public class ResourceHelperDummy implements ResourceHelperTeam {

    public ResourceHelperDummy(String resourcePath) {
    }

    @Override
    public String readResourceAsString() throws IOException {
        return null;
    }

    @Override
    public <T> T mapResourceToObject(Class<T> targetClass) throws IOException{
        return null;
    }
}
