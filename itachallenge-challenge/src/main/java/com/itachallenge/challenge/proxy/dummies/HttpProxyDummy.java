package com.itachallenge.challenge.proxy.dummies;

import com.itachallenge.challenge.config.dummies.PropertiesConfigDummy;
import com.itachallenge.challenge.proxy.team.HttpProxyTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class HttpProxyDummy implements HttpProxyTeam {

    @Autowired
    public HttpProxyDummy(PropertiesConfigDummy config){

    }

    public <T> Mono<T> getRequestData(String url, Class<T> clazz) {
        return null;
    }
}
