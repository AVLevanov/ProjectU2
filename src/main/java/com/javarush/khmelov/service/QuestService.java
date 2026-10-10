package com.javarush.khmelov.service;

import com.javarush.khmelov.entity.Quest;
import com.javarush.khmelov.entity.Question;
import com.javarush.khmelov.repository.QuestRepository;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

public class QuestService {
    private final QuestRepository questRepository;

    public QuestService(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public Optional<Quest> get(long id) {
        return questRepository.get(id);
    }

    public Collection<Quest> getAll() {
        return questRepository.getAll();
    }

    public Question getNextQuestion(Quest quest, Question currentQuestion) {
        LinkedList<Question> questions = quest.getQuestions();
        int index = questions.indexOf(currentQuestion);
        return questions.get(index + 1); // обработать исключение выхода за границы массива
    }
}
