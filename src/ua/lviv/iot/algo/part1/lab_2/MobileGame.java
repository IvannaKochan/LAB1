package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class MobileGame extends Game {

    private String androidVersion;

    public MobileGame(String gameName, String gameDescription, String gamePublisher, int currentPlayers, int reliseYear,
                      int minimumAgeForThisGame, String language, String androidVersion, int maxPlayers) {
        super(gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.androidVersion = androidVersion;
    }

    @Override
    public int connectPlayer(){
        if (currentPlayers < maxPlayers) {
            return currentPlayers++;
        }
        return currentPlayers;
    }

    @Override
    public int disconnectPlayer() {
        if (currentPlayers >= 1){
            return currentPlayers--;
        }
        return 0;
    }
}
