package com.javarush.khmelov.entity;

import java.util.LinkedList;

public class Quest extends Entity {
    private String name;
    private String description;
    private LinkedList<Question> questions;
    private User author;

    public User getAuthor() {
        return author;
    }

    public LinkedList<Question> getQuestions() {
        return questions;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Quest(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
