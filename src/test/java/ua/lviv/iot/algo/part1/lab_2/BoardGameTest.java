package ua.lviv.iot.algo.part1.lab_2;

import lombok.ToString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardGameTest {

    private BoardGame boardGame1;
    private BoardGame boardGame2;
    private BoardGame boardGame3;
    private BoardGame boardGame4;

    @Before
    public void setUp() {
        boardGame1 = new BoardGame("Dixid", "Some description", "Publisher 1",
                7, 2015, 8, "English", 3, 12);
        boardGame2 = new BoardGame("Monopoly", "Some description", "Publisher 1",
                12, 2015, 8, "English", 3, 12);
        boardGame3 = new BoardGame("ApleToAple", "Some description", "Publisher 1",
                2, 2015, 8, "English", 2, 12);
        boardGame4 = new BoardGame("-", "-", "-", 2, 2015,
                8, "-", 2, 12);
    }

    public boolean isMinPlayersIsPositive() {
        return boardGame1.getMinPlayers() >= 0;
    }

    @Test
    public void testConnectPlayer() {
        Assert.assertEquals(8, boardGame1.connectPlayer());
        Assert.assertEquals(12, boardGame2.connectPlayer());
        Assert.assertEquals(3, boardGame3.connectPlayer());
    }

    @Test
    public void testDisconnectPlayer() {
        System.out.println(boardGame1.disconnectPlayer());
        Assert.assertEquals(6, boardGame1.disconnectPlayer());
        Assert.assertEquals(11, boardGame2.disconnectPlayer());
        Assert.assertEquals(0, boardGame3.disconnectPlayer());
    }

    @Test
    public void testIsMinPlayersIsPositive() {
        Assert.assertEquals(true, isMinPlayersIsPositive());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("BoardGame(super=Game(maxPlayers=12, gameName=-, gameDescription=-, " +
                "gamePublisher=-, currentPlayers=2, reliseYear=2015, minimumAgeForThisGame=8, language=-)," +
                " minPlayers=2)", boardGame4.toString());
    }

}
