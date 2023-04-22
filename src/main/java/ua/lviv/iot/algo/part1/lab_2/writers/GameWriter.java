package ua.lviv.iot.algo.part1.lab_2.writers;

import ua.lviv.iot.algo.part1.lab_2.models.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;

public class GameWriter {
    public static final String SORTED_GAMES_FILE =
            "C:\\Users\\5095\\IdeaProjects\\LAB_3\\src\\main\\resources\\sortes-games.csv";

    public void sortedWriteToFile(List<Game> games) {
        if (games == null || games.isEmpty()) {
            return;
        }

        List<Game> sortedGameList = games.stream()
                                          .collect(groupingBy(w -> w.getClass().getSimpleName()))
                                          .entrySet().stream()
                                          .flatMap(entry -> entry.getValue().stream())
                                          .toList();
        String lastClassName = null;
        try (FileWriter writer = new FileWriter(SORTED_GAMES_FILE)) {
            for (var game : sortedGameList) {
                String className = game.getClass().getSimpleName();
                if (!className.equals(lastClassName)) {
                    writer.write(className + "\n");
                    writer.write(game.getHeaders() + "\n");
                    lastClassName = className;
                }
                writer.write(game.toCSV() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
