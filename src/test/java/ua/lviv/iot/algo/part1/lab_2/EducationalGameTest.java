package ua.lviv.iot.algo.part1.lab_2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EducationalGameTest  {

    private EducationalGame educationalGame1;
    private EducationalGame educationalGame2;
//    private EducationalGame educationalGame3;
    @Before
    public void setUp() {
        educationalGame1 = new EducationalGame("Duolingo", "Some description 7",
                "Publisher 7", 1, 2020, 12, "English",
                1, "English");
        educationalGame2 = new EducationalGame("AR Book", "Some description 8",
                "Publisher 8", 1, 2023, 12, "English",
                1, "Physics");
    }

    @Test
    public void testConnectPlayer() {
        Assert.assertEquals(1, educationalGame1.connectPlayer());
        Assert.assertEquals(1, educationalGame2.connectPlayer());
    }

    @Test
    public void testDisconnectPlayer() {
        Assert.assertEquals(0, educationalGame1.disconnectPlayer());
        Assert.assertEquals(0, educationalGame2.disconnectPlayer());
    }

}

