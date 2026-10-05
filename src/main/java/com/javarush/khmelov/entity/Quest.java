package com.javarush.khmelov.entity;

import java.util.LinkedList;

public class Quest extends Entity {
    String description;
    LinkedList<Question> questions;
    User author;

    public User getAuthor() {
        return author;
    }

    public LinkedList<Question> getQuestions() {
        return questions;
    }

    public String getDescription() {
        return description;
    }

    public Quest(Long id, String description) {
        this.id = id;
        this.description = description;
    }
}
