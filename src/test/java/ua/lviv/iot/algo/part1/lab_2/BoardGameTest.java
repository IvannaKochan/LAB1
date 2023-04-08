package ua.lviv.iot.algo.part1.lab_2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardGameTest {

    private BoardGame boardGame1;
    private BoardGame boardGame2;
    private BoardGame boardGame3;
    @Before
    public void setUp() {
        boardGame1 = new BoardGame("Dixid", "Some description", "Publisher 1",
                7, 2015, 8, "English", 3, 12);
        boardGame2 = new BoardGame("Monopoly", "Some description", "Publisher 1",
                12, 2015, 8, "English", 3, 12);
        boardGame3 = new BoardGame("ApleToAple", "Some description", "Publisher 1",
                2, 2015, 8, "English", 2, 12);
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

}