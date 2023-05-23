package com.itachallenge.challenge.dtos;

import java.util.List;

public interface FilterDtoI {

    String getTitle();
    List<String> getOptionsNames();
    boolean isMultipleOption();
    String getVisibilities();
    void setTitle(String title);
    void setOptionsNames(List<String> optionsNames);
    void setMultipleOption(boolean multipleOption);
    void setVisibilities(String visibilities);
}
