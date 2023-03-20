package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

@Setter
@Getter
@ToString
public abstract class Game {

    public int getMaxPlayer;
    private String gameName;
    private String gameDescription;
    protected String gamePublisher;
    protected int currentPlayers;
    protected int reliseYear;
    private int minimumAgeForThisGame;
    private String language;

    public abstract int connectPlayer();
    public abstract int disconnectPlayer();

    public Game(String gameName,String gameDescription, String gamePublisher, int currentPlayers, int reliseYear, int minimumAgeForThisGame, String language){
        this.gameName = gameName;
        this.gameDescription = gameDescription;
        this.gamePublisher = gamePublisher;
        this.currentPlayers = currentPlayers;
        this.reliseYear = reliseYear;
        this.minimumAgeForThisGame = minimumAgeForThisGame;
        this.language = language;
    };



}
