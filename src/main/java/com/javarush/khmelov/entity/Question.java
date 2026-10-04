package com.javarush.khmelov.entity;

import java.util.Set;

public class Question extends Entity{
    Quest quest;
    String text;
    Set<Answer> answers;

    public Question(Quest quest, String text, Set<Answer> answers) {
        this.text = text;
    }
}
