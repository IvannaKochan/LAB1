package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

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
    
}
