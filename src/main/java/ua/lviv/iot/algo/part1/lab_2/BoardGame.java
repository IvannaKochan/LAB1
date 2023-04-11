package ua.lviv.iot.algo.part1.lab_2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class BoardGame extends Game {

    private int minPlayers;

    public BoardGame(final String gameName, final String gameDescription,
                     final String gamePublisher, final int currentPlayers,
                     final int reliseYear, final int minimumAgeForThisGame,
                     final String language, final int minPlayers,
                     final int maxPlayers) {
        super(gameName, gameDescription, gamePublisher, currentPlayers,
                reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.minPlayers = minPlayers;
    }

    @Override
    public int connectPlayer() {
        if (currentPlayers < maxPlayers) {
            return ++currentPlayers;
        } else {
        return maxPlayers;
        }
    }

    @Override
    public int disconnectPlayer() {
        if (currentPlayers > minPlayers) {
            return currentPlayers - 1;
        }
        return 0;
    }
}

