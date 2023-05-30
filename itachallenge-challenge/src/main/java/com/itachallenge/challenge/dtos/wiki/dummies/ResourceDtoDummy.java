package com.itachallenge.challenge.dtos.wiki.dummies;

import com.itachallenge.challenge.dtos.wiki.team.ResourceDtoTeam;
import com.itachallenge.challenge.dtos.wiki.team.TopicDtoTeam;
import com.itachallenge.challenge.dtos.wiki.team.UserResourceDtoTeam;

import java.util.List;

public class ResourceDtoDummy implements ResourceDtoTeam {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getSlug() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getResourceType() {
        return null;
    }

    @Override
    public String getCreatedAt() {
        return null;
    }

    @Override
    public String getUpdatedAt() {
        return null;
    }

    @Override
    public UserResourceDtoDummy getUser() {
        return null;
    }

    @Override
    public List<TopicDtoDummy> getTopics() {
        return null;
    }
}
