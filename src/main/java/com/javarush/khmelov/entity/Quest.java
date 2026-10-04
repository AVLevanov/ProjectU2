package com.javarush.khmelov.entity;

import java.util.LinkedList;

public class Quest extends Entity {
    String Description;
    LinkedList<Question> questions;
    User author;

    public Quest(Long id, String description, LinkedList<Question> questions) {
        this.id = id;
        this.Description = description;
        this.questions = questions;
    }
}
