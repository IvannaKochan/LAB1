package ua.lviv.iot.algo.part1.lab_2.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Setter
@Getter
@ToString
public abstract class Game {

    private int maxPlayers;
    private String gameName;
    private String gameDescription;
    private String gamePublisher;
    private int currentPlayers;
    private int reliseYear;
    private int minimumAgeForThisGame;
    private String language;

    public Game(final String gameName, final String gameDescription, final String gamePublisher,
                final int currentPlayers, final int reliseYear, final int minimumAgeForThisGame,
                final String language, final int maxPlayers) {
        this.gameName = gameName;
        this.gameDescription = gameDescription;
        this.gamePublisher = gamePublisher;
        this.currentPlayers = currentPlayers;
        this.reliseYear = reliseYear;
        this.minimumAgeForThisGame = minimumAgeForThisGame;
        this.language = language;
        this.maxPlayers = maxPlayers;
    }

    public abstract int connectPlayer();

    public abstract int disconnectPlayer();

    public String getHeaders() {
      return "gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, " +
              "minimumAgeForThisGame, language, maxPlayers";
    }

    public String toCSV() {
        return gameName + ", " + gameDescription + ", " + gamePublisher + ", " + currentPlayers + ", " + reliseYear +
                "," + minimumAgeForThisGame +", " + ", "+ language + ", " + maxPlayers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Game game = (Game) o;
        return maxPlayers == game.maxPlayers
                && currentPlayers == game.currentPlayers
                && reliseYear == game.reliseYear
                && minimumAgeForThisGame == game.minimumAgeForThisGame
                && gameName.equals(game.gameName)
                && gameDescription.equals(game.gameDescription)
                && gamePublisher.equals(game.gamePublisher)
                && language.equals(game.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxPlayers, gameName, gameDescription,
                gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language);
    }

}
