package ua.lviv.iot.algo.part1.lab_2;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private List<Game> games;


    public GameManager(final List<Game> games) {
        this.games = new ArrayList<>(games);
    }

    public void addGame(final Game game) {
        games.add(game);
    }

    public List<Game> findAllGamesYoungerThan(final int reliseYearTheOldestGame) {
        return games.stream()
                .filter(g -> (g.getReliseYear() > reliseYearTheOldestGame))
                .toList();
    }

    public List<Game> findAllGamesForThisNumberOfPlayers(final int numberOfPlayers) {
        return games.stream()
                .filter(g -> (numberOfPlayers <= g.maxPlayers))
                .toList();
    }

    public void printAllGamesYoungerThan(final int reliseYearTheOldestGame) {
        System.out.println("Games which was realised later than "
                + reliseYearTheOldestGame + ":");
        findAllGamesYoungerThan(reliseYearTheOldestGame).forEach(System
                .out::println);
    }

    public void printAllGamesWithNeededNumberOfPlayer(final int numberOfPlayers) {
        System.out.println("Games in which can play " + numberOfPlayers
                + "number of players");
        findAllGamesForThisNumberOfPlayers(numberOfPlayers).forEach(System
                .out::println);
    }
}



