package ua.lviv.iot.algo.part1.lab_2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComputerGameTest {

    private ComputerGame computerGame1;
    private ComputerGame computerGame2;
    private ComputerGame computerGame3;
    @Before public void setUp() {
        computerGame1 = new ComputerGame("Fifa2023", "Some description 3",
                "Publisher 3", 22, 2023, 12, "English",
                "1.1.3", "sport game", "PS4", 4.5, 22, 22);

        computerGame2 = new ComputerGame("S.T.A.L.K.E.R. 2", "Some description 4",
                "GSC Game World", 50, 2023, 16, "English",
                "2.0.1", "horor", "Windows", 9.9, 100, 1);

        computerGame3 = new ComputerGame("new name", "Some description 4",
                "GSC Game World", 1, 2023, 16, "English",
                "2.0.1", "horor", "Windows", 9.9, 100, 1);
    }

    @Test
    public void testConnectPlayer() {
        Assert.assertEquals( 22, computerGame1.connectPlayer());
        Assert.assertEquals(51, computerGame2.connectPlayer());
        Assert.assertEquals(2, computerGame3.connectPlayer());
    }

    @Test
    public void testDisconnectPlayer() {
        Assert.assertEquals(21, computerGame1.disconnectPlayer());
        Assert.assertEquals(49, computerGame2.disconnectPlayer());
        Assert.assertEquals(0, computerGame3.disconnectPlayer());
    }

}