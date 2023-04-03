package ua.lviv.iot.algo.part1.lab_2;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class EducationalGame extends Game{

    private String subject;
    public EducationalGame(String gameName, String gameDescription, String gamePublisher, int currentPlayers, int reliseYear, int minimumAgeForThisGame, String language, int maxPlayers, String  subject) {
        super(gameName, gameDescription, gamePublisher, currentPlayers, reliseYear, minimumAgeForThisGame, language, maxPlayers);
        this.subject = subject;
    }

    @Override
    public int connectPlayer(){
        int temperaryVariableForConnectingPlayer = currentPlayers;
        if (temperaryVariableForConnectingPlayer < maxPlayers) {
            temperaryVariableForConnectingPlayer++;
        }
        return temperaryVariableForConnectingPlayer;
    }

    @Override
    public int disconnectPlayer() {
        int temperaryVariableForDisconnectingPlayer = currentPlayers;
        if (temperaryVariableForDisconnectingPlayer >= 1){
            temperaryVariableForDisconnectingPlayer--;
        }
        return temperaryVariableForDisconnectingPlayer;
    }
}
