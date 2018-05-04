package com.codecool.java.expertsystem.model;

public class Question {

    private String id;

    public Question(String id, String question, Answer answer) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getQuestion() {
        //TODO: Implement method
        return null;
    }

    public Answer getAnswer() {
        return null;
        //TODO: Implement method
    }

    public boolean getEvaluatedAnswer(String input) {
        return false;
        //TODO: Implement method
    }
}
