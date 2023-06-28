package ua.lviv.iot.algo.part1.lab_2.managers;

import ua.lviv.iot.algo.part1.lab_2.models.*;
import ua.lviv.iot.algo.part1.lab_2.writers.GameWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameManager {
    public static List<Game> games;


    public GameManager(final List<Game> games) {
        GameManager.games = new ArrayList<>(games);
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

    public static void main(String[] args) {
        games = Arrays.asList(
                new BoardGame("Dixid","Some description", "Publisher 1",
                        7, 2015, 8, "English", 3, 12),
                new BoardGame("Alias","Some description 2", "Publisher 2",
                        5, 1995, 6, "English", 2, 10),
                new ComputerGame("Fifa2023","Some description 3", "Publisher 3",
                        22, 2023, 12, "English", "1.1.3", "sport game",
                        "PS4", 4.5 , 22, 22),
                new ComputerGame("S.T.A.L.K.E.R. 2","Some description 4", "GSC Game World",
                        32, 2023, 16, "English", "2.0.1", "horor",
                        "Windows", 9.9, 100, 1),
                new MobileGame("Clash Of Clans","Some description 5", "Publisher 5",
                        2, 2012, 8, "English", "8.0.0", 2),
                new MobileGame("Hay Day","Some description 6", "Publisher 6",
                        1, 2016, 3, "English", "7.5.3", 1000),
                new EducationalGame("Duolingo","Some description 7", "Publisher 7",
                        1, 2020, 12, "English", 1, "English"),
                new EducationalGame("AR Book","Some description 8", "Publisher 8",
                        1, 2023, 12, "English", 1, "Physics"));
        GameWriter gameWriter = new GameWriter();
        gameWriter.sortedWriteToFile(games);

    }

}
