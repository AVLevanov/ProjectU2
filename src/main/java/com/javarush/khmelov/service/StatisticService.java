package com.javarush.khmelov.service;

import com.javarush.khmelov.entity.Game;
import com.javarush.khmelov.entity.State;
import com.javarush.khmelov.entity.User;
import com.javarush.khmelov.repository.GameRepository;
import com.javarush.khmelov.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StatisticService {
    private final GameRepository gameRepository;
    private final UserRepository userRepository;
    private Map<User, ArrayList<Integer>> map = new HashMap<>();

    public StatisticService(GameRepository gameRepository, UserRepository userRepository) {
        this.gameRepository = gameRepository;
        this.userRepository = userRepository;
    }

    public Map<User, ArrayList<Integer>> getCommonStat() {
        for (User user : userRepository.getAll()) {
            map.put(user, getUserStat(user, gameRepository));
        }
        return map;
    }

    public ArrayList<Integer> getUserStat(User user, GameRepository gameRepository) {
        ArrayList<Integer> userStat = new ArrayList<>();
        Collection<Game> games = gameRepository.getAll();
//        Collection<Game> userGames = null;
//        for (Game game : games) {
//            if (game.getUser().equals(user)) {
//                userGames.add(game);
//            }
//        }
        int play = 0;
        int win = 0;
        int loss = 0;
        for (Game game : games) {
            if (game.getState().equals(State.PLAY) && game.getUser().equals(user)) {
                play = play + 1;
            } else if (game.getState().equals(State.WIN) && game.getUser().equals(user)) {
                win = win + 1;
            } else if (game.getState().equals(State.LOSS) && game.getUser().equals(user)) {
                loss = loss + 1;
            }
        }
        int total = play + win + loss;
        userStat.add(play);
        userStat.add(win);
        userStat.add(loss);
        userStat.add(total);
        return userStat;
    }
}

