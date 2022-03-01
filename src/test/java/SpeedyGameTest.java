import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {

    @Test
    public void allNegSpeedsRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(-1);
        speedyGame.setTrafficGreenLight(false);

        int speed = 0;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void allNegSpeedsGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        speedyGame.setMaxSpeed(-1);
        speedyGame.setTrafficGreenLight(false);

        int speed = 0;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void setNegMaxSpeedsNegSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void setNegMaxSpeedsNegSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void setNegMaxSpeedsIsSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void setNegMaxSpeedsIsSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void speedIsBorderNegRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void speedIsBorderNegGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void speedIsBorderPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void speedIsBorderPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void setNegMaxSpeedsIsSpeedPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 7;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void setNegMaxSpeedsIsSpeedPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 7;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void speedIsBorder2PosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void speedIsBorder2PosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-4);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void speedNoMaxSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(0);
        speedyGame.setTrafficGreenLight(false);

        int speed = -1;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void resultChangeGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        speedyGame.setMaxSpeed(7);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void resultChangeRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(7);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void resultChangeNegSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void resultChangeNegSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void resultChangeAllSpeedPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void resultChangeAllSpeedPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void resultChangeAllSpeedNegGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void resultChangeAllSpeedNegRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }


    @Test
    public void getMaxSpeedNegNeg() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(-1);

        int expected = 5;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSpeedNegPos() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(1);

        int expected = 1;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSpeedPosPos() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(1);

        int expected = 1;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSpeedPosNeg() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-1);

        int expected = 5;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSpeedNegZero() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(0);

        int expected = 0;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSpeedPosZero() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(0);

        int expected = 0;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

}

