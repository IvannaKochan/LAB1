package ua.lviv.iot.algo.part1.lab_2;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private final List<Game> games;


    public GameManager(final List<Game> games) {
        this.games = new ArrayList<>(games);
    }

    public List<Game> findAllGamesYoungerThan(final int reliseYearTheOldestGame) {
        return games.stream()
                .filter(g -> (g.getReliseYear() > reliseYearTheOldestGame))
                .toList();
    }

    public List<Game> findAllGamesForThisNumberOfPlayers(final int numberOfPlayers) {
        return games.stream()
                .filter(g -> (numberOfPlayers <= g.getMaxPlayers()))
                .toList();
    }

}
