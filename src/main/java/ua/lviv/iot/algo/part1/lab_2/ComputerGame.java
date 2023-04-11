package ua.lviv.iot.algo.part1.lab_2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ComputerGame extends Game {

    private String gameVersion;
    private String gameGenre;
    private String gamePlatform;
    private double rating;
    private int minPlayers;

    public ComputerGame(final String gameName, final String gameDescription,
                        final String gamePublisher, final int currentPlayers,
                        final  int reliseYear, final int minimumAgeForThisGame,
                        final String language, final String gameVersion,
                        final String gameGenre, final String gamePlatform,
                        final double rating, final int maxPlayers, final int minPlayers) {
        super(gameName, gameDescription, gamePublisher, currentPlayers, reliseYear,
                minimumAgeForThisGame, language, maxPlayers);
        this.gameVersion = gameVersion;
        this.gameGenre = gameGenre;
        this.gamePlatform = gamePlatform;
        this.rating = rating;
        this.minPlayers = minPlayers;
    }

    @Override
    public int connectPlayer() {
        if (currentPlayers < maxPlayers) {
            return ++currentPlayers;
        }
        return currentPlayers;
    }

    @Override
    public int disconnectPlayer() {
        if (currentPlayers >= 1) {
            return --currentPlayers;
        }
        return 0;
    }
}
