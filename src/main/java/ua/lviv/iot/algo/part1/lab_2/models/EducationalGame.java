package ua.lviv.iot.algo.part1.lab_2.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public final class EducationalGame extends Game {

    private String subject;

    public EducationalGame(final String gameName, final String gameDescription,
                           final String gamePublisher, final int currentPlayers,
                           final int reliseYear,
                           final int minimumAgeForThisGame,
                           final String language, final int maxPlayers,
                           final String subject) {
        super(gameName, gameDescription, gamePublisher, currentPlayers,
                reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.subject = subject;
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
        return super.getHeaders() + ", subject";
    }

    @Override
    public String toCSV(){
        return super.toCSV() + ", " + subject;
    }
}
