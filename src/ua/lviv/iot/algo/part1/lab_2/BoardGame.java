package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class BoardGame extends Game {

    private int minPlayers;
    private int maxPlayers;

    public BoardGame(String gameName,String gameDescription, String gamePublisher, int currentPlayers, int reliseYear, int minimumAgeForThisGame,
                     String language, int minPlayers, int maxPlayers) {
        super(gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language);
        this.maxPlayers = maxPlayers;
        this.minPlayers = minPlayers;
    }

    @Override
    public int connectPlayer(){
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
        return currentPlayers;
    }

    @Override
    public int disconnectPlayer() {
        if (currentPlayers >= 1){
            currentPlayers--;
        }
        return currentPlayers;
    }

};

