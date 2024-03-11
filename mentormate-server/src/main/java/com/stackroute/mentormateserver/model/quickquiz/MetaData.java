package com.stackroute.mentormateserver.model.quickquiz;

public class MetaData {

    private Integer noOfQuestions;

    private String difficultyLevel;

    public MetaData() {
    }

    public MetaData(Integer noOfQuestions, String difficultyLevel) {
        this.noOfQuestions = noOfQuestions;
        this.difficultyLevel = difficultyLevel;
    }

    public Integer getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(Integer noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
