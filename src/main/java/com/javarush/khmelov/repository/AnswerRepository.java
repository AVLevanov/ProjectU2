package com.javarush.khmelov.repository;

import com.javarush.khmelov.entity.Answer;
import com.javarush.khmelov.entity.State;
import com.javarush.khmelov.entity.User;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class AnswerRepository implements Repository<Answer> {

    public static final AtomicLong id = new AtomicLong(System.currentTimeMillis());

    public AnswerRepository(){
        Map<Long, Answer> map = new HashMap<>();
        map.put(1L, new Answer("Принять вызов", State.PLAY));
        map.put(2L, new Answer("Отклонить вызов", State.LOSS));
        map.put(3L, new Answer("Подняться на мостик", State.PLAY));
        map.put(4L, new Answer("Отказаться подняться на мостик", State.LOSS));
        map.put(5L, new Answer("Рассказать правду о себе", State.WIN));
        map.put(6L, new Answer("Солгать о себе", State.LOSS));
    }

    @Override
    public Collection<Answer> getAll() {
        return List.of();
    }

    @Override
    public Optional<Answer> get(long id) {
        return Optional.empty();
    }

    @Override
    public void create(Answer entity) {

    }

    @Override
    public void update(Answer entity) {

    }

    @Override
    public void delete(Answer entity) {

    }
}
