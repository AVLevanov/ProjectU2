package com.javarush.khmelov.repository;

import com.javarush.khmelov.entity.Question;

import java.util.*;

public class QuestionRepository implements Repository<Question>{

    @Override
    public Collection<Question> getAll() {
        return List.of();
    }

    @Override
    public Optional<Question> get(long id) {
        return Optional.empty();
    }

    @Override
    public void create(Question entity) {

    }

    @Override
    public void update(Question entity) {

    }

    @Override
    public void delete(Question entity) {

    }
}
