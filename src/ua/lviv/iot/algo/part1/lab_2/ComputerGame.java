package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class ComputerGame extends Game{

    private String gameVersion;
    private String gameGenre;
    private String gamePlatform;
    private double rating;
    private int minPlayers;

    public ComputerGame(String gameName,String gameDescription, String gamePublisher, int currentPlayers, int reliseYear,
                        int minimumAgeForThisGame, String language, String gameVersion, String gameGenre, String gamePlatform,
                        double rating, int maxPlayers, int minPlayers) {
        super(gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.gameVersion = gameVersion;
        this.gameGenre = gameGenre;
        this.gamePlatform = gamePlatform;
        this.rating = rating;
        this.minPlayers = minPlayers;
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
