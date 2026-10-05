package com.javarush.khmelov.repository;

import com.javarush.khmelov.entity.Answer;
import com.javarush.khmelov.entity.Question;
import com.javarush.khmelov.entity.State;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class QuestionRepository implements Repository<Question> {
    public static final AtomicLong id = new AtomicLong(System.currentTimeMillis());

    public QuestionRepository() {
        Map<Long, Question> map = new HashMap<>();
        map.put(1L, new Question("Ты потерял память. Принять вызов НЛО?"));
        map.put(2L, new Question("Ты принял вызов. Поднимаешься на мостик к капитану?"));
        map.put(3L, new Question("Ты поднялся на мостик. Кто ты?"));
    }

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
