package com.javarush.khmelov.cmd;

import com.javarush.khmelov.config.Config;
import com.javarush.khmelov.entity.Answer;
import com.javarush.khmelov.entity.Quest;
import com.javarush.khmelov.entity.Question;
import com.javarush.khmelov.entity.State;
import com.javarush.khmelov.repository.AnswerRepository;
import com.javarush.khmelov.repository.QuestionRepository;
import com.javarush.khmelov.service.QuestService;
import com.javarush.khmelov.util.Parameter;
import jakarta.servlet.http.HttpServletRequest;

public class PlayQuest implements Command {

    private final QuestService questService;
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;
    private final Config config;

    public PlayQuest(QuestService questService, QuestionRepository questionRepository, AnswerRepository answerRepository, Config config) {
        this.questService = questService;
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
        this.config = config;
    }

    public String doGet(HttpServletRequest req) {
        String stringQuestId = req.getParameter(Parameter.ID);
        String stringNextQuestionId = req.getParameter(Parameter.QUESTION_ID);
        String stringAnswerId = req.getParameter(Parameter.ANSWER_ID);
        long questId = Long.parseLong(stringQuestId);
        Quest quest = questService.get(questId).get();
        Question nextQuestion = null;
        if (stringNextQuestionId != null) {
            long questionId = Long.parseLong(stringNextQuestionId);
            nextQuestion = quest.getNextQuestion(questionId);
        } else {
            nextQuestion = quest.getFirstQuestion();
        }
        if (stringAnswerId != null) {
            long answerId = Long.parseLong(stringAnswerId);
            Answer answer = answerRepository.get(answerId).get();
            State state = answer.getState();
            req.setAttribute(Parameter.STATE, state);
        }
        req.setAttribute(Parameter.QUEST, quest);
        req.setAttribute(Parameter.QUESTION, nextQuestion);

        return getView();
    }
}
