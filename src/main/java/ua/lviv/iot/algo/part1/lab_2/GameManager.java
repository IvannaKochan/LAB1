package ua.lviv.iot.algo.part1.lab_2;
import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final List<Game> games = new ArrayList<>();
    public static void main(String[] args) {
        GameManager.addGame(new BoardGame("Dixid","Some description", "Publisher 1",
                7, 2015, 8, "English", 3, 12));
        GameManager.addGame(new BoardGame("Alias","Some description 2", "Publisher 2",
                5, 1995, 6, "English", 2, 10));
        GameManager.addGame(new ComputerGame("Fifa2023","Some description 3", "Publisher 3",
                22, 2023, 12, "English", "1.1.3", "sport game",
                "PS4", 4.5 , 22, 22));
        GameManager.addGame(new ComputerGame("S.T.A.L.K.E.R. 2","Some description 4", "GSC Game World",
                32, 2023, 16, "English", "2.0.1", "horor",
                "Windows", 9.9, 100, 1));
        GameManager.addGame(new MobileGame("Clash Of Clans","Some description 5", "Publisher 5",
                2, 2012, 8, "English", "8.0.0", 2));
        GameManager.addGame(new MobileGame("Hay Day","Some description 6", "Publisher 6",
                1, 2016, 3, "English", "7.5.3", 1000));
        GameManager.addGame(new EducationalGame("Duolingo","Some description 7", "Publisher 7",
                1, 2020, 12, "English", 1, "English"));
        GameManager.addGame(new EducationalGame("AR Book","Some description 8", "Publisher 8",
                1, 2023, 12, "English", 1, "Physics"));

        GameManager.findAllGamesYoungerThan(games, 2019);
        GameManager.findAllGamesForThisNumberOfPlayers(games, 10);

        for (Game game: games) {
            System.out.println("After adding, number of player is " + game.connectPlayer());
            System.out.println("After removing, number of player is " + game.disconnectPlayer());
            System.out.println(game);
        }
    }

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
        System.out.println("Games in which can play" + numberOfPlayers + "number of players");
        findAllGamesForThisNumberOfPlayers(gameList, numberOfPlayers).forEach(System.out::println);
    }
}



