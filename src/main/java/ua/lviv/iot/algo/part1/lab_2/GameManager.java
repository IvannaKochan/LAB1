package ua.lviv.iot.algo.part1.lab_2;
import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final List<Game> games = new ArrayList<>();

    public static void addGame(final Game game){games.add(game);}

    public static List<Game> findAllGamesYoungerThan(List<Game> gamesList, int reliseYearTheOldestGame) {
        return gamesList.stream().filter(g ->(g.getReliseYear() > reliseYearTheOldestGame)).toList();
    }

    public static List<Game> findAllGamesForThisNumberOfPlayers(List<Game> gamesList, int numberOfPlayers) {
        return gamesList.stream().filter(g -> (numberOfPlayers <= g.maxPlayers)).toList();
    }

    public static void printAllGamesYoungerThan(List<Game> gamesList, int reliseYearTheOldestGame){
        System.out.println("Games which was realised later than "+ reliseYearTheOldestGame + ":");
        findAllGamesYoungerThan(gamesList, reliseYearTheOldestGame).forEach(System.out::println);
    }

    public static void printAllGamesWithNeededNumberOfPlayer(List<Game> gameList, int numberOfPlayers) {
        System.out.println("Games in which can play " + numberOfPlayers + " number of players");
        findAllGamesForThisNumberOfPlayers(gameList, numberOfPlayers).forEach(System.out::println);
    }
}



