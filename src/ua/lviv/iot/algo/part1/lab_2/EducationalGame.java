package ua.lviv.iot.algo.part1.lab_2;

import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class EducationalGame extends Game{

    private int maxPlayers;
    private String subject;
    public EducationalGame(String gameName, String gameDescription, String gamePublisher, int currentPlayers, int reliseYear, int minimumAgeForThisGame, String language, int maxPlayers, String  subject) {
        super(gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language);
        this.maxPlayers = maxPlayers;
        this.subject = subject;
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
}
