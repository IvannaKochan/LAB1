package ua.lviv.iot.algo.part1.lab_2.writers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.algo.part1.lab_2.utils.AbstractTestUtils;
import ua.lviv.iot.algo.part1.lab_2.models.Game;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ua.lviv.iot.algo.part1.lab_2.utils.AbstractTestUtils.prepareTestGames;

public class GameWriterTest {

    private static final String expected_sorted_file = "C:\\Users\\5095\\IdeaProjects\\LAB_3\\src\\main\\resources\\sortes-games.csv";
    GameWriter gameWriter;
    List<Game> games;
    @BeforeEach
    public void setUp() {
        gameWriter = new GameWriter();
        games = AbstractTestUtils.prepareTestGames();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(GameWriter.SORTED_GAMES_FILE));
    }

    @Test
    public void testEmptySortedWrite() {
        gameWriter.sortedWriteToFile(null);
        File result = new File(GameWriter.SORTED_GAMES_FILE);
        assertFalse(result.exists());
    }

    @Test
    public void testSortedRewriteToFile() throws IOException {
        try (FileWriter fileWriter = new FileWriter(GameWriter.SORTED_GAMES_FILE)) {
            fileWriter.write("rewriting (sorted)...");
        } catch (IOException e) {
            e.printStackTrace();
        }
        testSortedWriteToFile();
    }
    @Test
    public void testSortedWriteToFile() throws IOException {
        prepareTestGames();
        gameWriter.sortedWriteToFile(prepareTestGames());

        Path expected = new File(expected_sorted_file).toPath();
        Path actual = new File(GameWriter.SORTED_GAMES_FILE).toPath();

        assertEquals(-1L, Files.mismatch(expected, actual));
    }

}