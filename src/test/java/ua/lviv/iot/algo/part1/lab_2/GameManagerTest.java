package ua.lviv.iot.algo.part1.lab_2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameManagerTest {

    private List<Game> games;

    private final ArrayList<Game> gamesYoungerThan = new ArrayList<>(Arrays.asList(
            new ComputerGame("Fifa2023","Some description 3", "Publisher 3",
                22, 2023, 12, "English", "1.1.3",
                "sport game", "PS4", 4.5 , 22, 22),
            new ComputerGame("S.T.A.L.K.E.R. 2","Some description 4", "GSC Game World",
                32, 2023, 16, "English", "2.0.1",
                "horor", "Windows", 9.9, 100, 1),
            new EducationalGame("Duolingo","Some description 7", "Publisher 7",
                1, 2020, 12, "English", 1, "English"),
            new EducationalGame("AR Book","Some description 8", "Publisher 8",
                1, 2023, 12, "English", 1, "Physics")));

    private final ArrayList<Game> gamesInWichCanPlayGivenNumberOfPlayers = new ArrayList<>(Arrays.asList(
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
            new MobileGame("Hay Day","Some description 6", "Publisher 6",
                1, 2016, 3, "English", "7.5.3", 1000)));

    @Before
    public void setUp(){
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
    }

    @Test
    public void testFindAllGamesYoungerThan(){
        List<Game> result = GameManager.findAllGamesYoungerThan(games, 2019);
        Assert.assertEquals(gamesYoungerThan.size(), result.size());
        for (int i = 0; i < gamesYoungerThan.size(); i++){
            Assert.assertEquals(gamesYoungerThan.get(i), result.get(i));
        }
    }

    @Test
    public void testFindAllGamesForThisNumberOfPlayers(){
        List<Game> result = GameManager.findAllGamesForThisNumberOfPlayers(games, 10);
        Assert.assertEquals(gamesInWichCanPlayGivenNumberOfPlayers.size(), result.size());
        for (int i = 0; i < gamesInWichCanPlayGivenNumberOfPlayers.size(); i++) {
            Assert.assertEquals(gamesInWichCanPlayGivenNumberOfPlayers.get(i), result.get(i));
        }
    }
}