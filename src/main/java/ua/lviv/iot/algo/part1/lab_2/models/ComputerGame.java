package ua.lviv.iot.algo.part1.lab_2.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public final class ComputerGame extends Game {

    private String gameVersion;
    private String gameGenre;
    private String gamePlatform;
    private double rating;
    private int minPlayers;

    public ComputerGame(final String gameName, final String gameDescription,
                        final String gamePublisher, final int currentPlayers,
                        final int reliseYear, final int minimumAgeForThisGame,
                        final String language, final String gameVersion,
                        final String gameGenre, final String gamePlatform,
                        final double rating, final int maxPlayers,
                        final int minPlayers) {
        super(gameName, gameDescription, gamePublisher, currentPlayers,
                reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.gameVersion = gameVersion;
        this.gameGenre = gameGenre;
        this.gamePlatform = gamePlatform;
        this.rating = rating;
        this.minPlayers = minPlayers;
    }

    @Override
    public int connectPlayer() {
        if (getCurrentPlayers() < getMaxPlayers()) {
            return getCurrentPlayers() + 1;
        }
        return getCurrentPlayers();
    }

    @Override
    public int disconnectPlayer() {
        return getCurrentPlayers() - 1;
    }

    @Override
    public String getHeaders(){
        return super.getHeaders() + ", gameVersion, gameGenre, gamePlatform, rating, minPlayers";
    }

    @Override
    public String toCSV(){
        return super.toCSV() + ", " +gameVersion + ", " + gameGenre + ", " + gamePlatform + ", " + rating + ", " + minPlayers;
    }
}
