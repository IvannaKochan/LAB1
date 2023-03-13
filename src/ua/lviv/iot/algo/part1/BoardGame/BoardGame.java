package ua.lviv.iot.algo.part1.BoardGame;
import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BoardGame {

    private String title;
    private int minPlayers;
    private int maxPlayers;
    private int currentPlayers;

    private static BoardGame defaultGame = new BoardGame();

    public static BoardGame getInstance(){return defaultGame;}

    public void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        }
    }
    public void removePlayers(){
        if (currentPlayers >= 1){
            currentPlayers--;
        }
    }
    public Boolean canPlay(){
        return currentPlayers >= minPlayers && maxPlayers >= currentPlayers;
    }

    public static void main(String[] args) {

        BoardGame[] boardGames = { new BoardGame(),
                new BoardGame("Twister", 2, 6, 3),
                getInstance(),
                getInstance()
        };

        for (BoardGame game : boardGames){
            System.out.println(game);
        }

    }
};

