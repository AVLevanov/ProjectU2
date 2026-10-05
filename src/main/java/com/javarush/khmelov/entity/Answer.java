package com.javarush.khmelov.entity;

public class Answer extends Entity{
    Question question;
    String text;
    State state;

    public Question getQuestion() {
        return question;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public Answer(String text, State state) {
        this.text = text;
        this.state = state;
    }
}
