package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

import java.util.Objects;

@Setter
@Getter
@ToString
public abstract class Game {

    protected int maxPlayers;
    protected String gameName;
    protected String gameDescription;
    protected String gamePublisher;
    protected int currentPlayers;
    protected int reliseYear;
    protected int minimumAgeForThisGame;
    protected String language;

    public abstract int connectPlayer();
    public abstract int disconnectPlayer();


    public Game(String gameName,String gameDescription, String gamePublisher, int currentPlayers, int reliseYear, int minimumAgeForThisGame, String language, int maxPlayers){
        this.gameName = gameName;
        this.gameDescription = gameDescription;
        this.gamePublisher = gamePublisher;
        this.currentPlayers = currentPlayers;
        this.reliseYear = reliseYear;
        this.minimumAgeForThisGame = minimumAgeForThisGame;
        this.language = language;
        this.maxPlayers = maxPlayers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return maxPlayers == game.maxPlayers && currentPlayers == game.currentPlayers && reliseYear == game.reliseYear && minimumAgeForThisGame == game.minimumAgeForThisGame && gameName.equals(game.gameName) && gameDescription.equals(game.gameDescription) && gamePublisher.equals(game.gamePublisher) && language.equals(game.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxPlayers, gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language);
    }



}
