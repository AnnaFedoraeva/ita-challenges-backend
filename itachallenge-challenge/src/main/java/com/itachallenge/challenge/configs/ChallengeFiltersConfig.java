package com.itachallenge.challenge.configs;

import java.util.List;

public interface ChallengeFiltersConfig {
    //configuration class: loads from properties

    String getLanguageTitle();
    List<String> getLanguageOptionsNames();
    boolean isLanguageMultipleOption();
    String getLanguageVisibilities();


    String getDifficultyTitle();
    List<String> getDifficultyOptionsNames();
    boolean isDifficultyMultipleOption();
    String getDifficultyVisibilities();

    String getProgressTitle();
    List<String> getProgressOptionsNames();
    boolean isProgressMultipleOption();
    String getProgressLanguageVisibilities();

}
