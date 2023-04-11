package ua.lviv.iot.algo.part1.lab_2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MobileGameTest  {
    private MobileGame mobileGame1;
    private MobileGame mobileGame2;
    private MobileGame mobileGame3;

    @Before
    public void setUp() {
     mobileGame1 = new MobileGame("Clash Of Clans","Some description 5", "Publisher 5",
             2, 2012, 8, "English", "8.0.0", 2);
     mobileGame2 = new MobileGame("Hay Day","Some description 6", "Publisher 6",
             1, 2016, 3, "English", "7.5.3", 1000);
     mobileGame3 = new MobileGame("-","-", "-", 1, 2016,
             3, "-", "-", 1000);
    }

    @Test
    public void testConnectPlayer() {
        Assert.assertEquals(2, mobileGame1.connectPlayer());
        Assert.assertEquals(2, mobileGame2.connectPlayer());
    }

    @Test
    public void testDisconnectPlayer() {
        Assert.assertEquals(1, mobileGame1.disconnectPlayer());
        Assert.assertEquals(0, mobileGame2.disconnectPlayer());
    }

}
