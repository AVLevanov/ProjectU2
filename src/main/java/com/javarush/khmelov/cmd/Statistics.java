package com.javarush.khmelov.cmd;

import com.javarush.khmelov.entity.User;
import com.javarush.khmelov.service.StatisticService;
import com.javarush.khmelov.util.Parameter;
import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Map;

public class Statistics implements Command {
    private final StatisticService statisticService;

    public Statistics(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    @Override
    public String doGet(HttpServletRequest req) {
    Map<User, ArrayList<Integer>> map = statisticService.getCommonStat();
    req.setAttribute(Parameter.STAT, map);
        return getView();
    }
}
