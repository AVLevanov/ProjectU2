package com.javarush.khmelov.entity;

import java.util.Set;

public class Question extends Entity{
    Quest quest;
    String text;
    Set<Answer> answers;

    public Quest getQuest() {
        return quest;
    }

    public String getText() {
        return text;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public Question(String text) {
        this.text = text;
    }
}
