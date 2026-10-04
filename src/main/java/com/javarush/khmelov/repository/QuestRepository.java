package com.javarush.khmelov.repository;

import com.javarush.khmelov.entity.Quest;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class QuestRepository implements Repository<Quest>{

    public static final AtomicLong id = new AtomicLong(System.currentTimeMillis());

    public QuestRepository() {
        Map<Long, Quest> map = new HashMap<>();
        map.put(1L, new Quest(1L, "Похищение пришельцами", new LinkedList<>()));
    }

    @Override
    public Collection<Quest> getAll() {
        return List.of();
    }

    @Override
    public Optional<Quest> get(long id) {
        return Optional.empty();
    }

    @Override
    public void create(Quest entity) {

    }

    @Override
    public void update(Quest entity) {

    }

    @Override
    public void delete(Quest entity) {

    }
}
