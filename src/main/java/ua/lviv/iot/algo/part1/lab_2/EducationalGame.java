package ua.lviv.iot.algo.part1.lab_2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class EducationalGame extends Game {

    private String subject;
    public EducationalGame(final String gameName, final String gameDescription,
                           final String gamePublisher, final int currentPlayers,
                           final int reliseYear, final int minimumAgeForThisGame,
                           final String language, final int maxPlayers, final String  subject) {
        super(gameName, gameDescription, gamePublisher, currentPlayers,
                reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.subject = subject;
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
