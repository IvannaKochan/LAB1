package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class BoardGame extends Game {

    private int minPlayers;

    public BoardGame(String gameName,String gameDescription, String gamePublisher, int currentPlayers, int reliseYear, int minimumAgeForThisGame,
                     String language, int minPlayers, int maxPlayers) {
        super(gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.minPlayers = minPlayers;
    }

    @Override
    public int connectPlayer(){
        if (currentPlayers < maxPlayers) {
            return ++currentPlayers;
        }else {
        return maxPlayers;
        }
    }

    @Override
    public int disconnectPlayer() {
        if (currentPlayers > minPlayers){
            return currentPlayers - 1;
        }
        return 0;
    }

}

