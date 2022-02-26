import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {

    @Test
    public void speedyGameAllNegSpeedsRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(-1);
        speedyGame.setTrafficGreenLight(false);

        int speed = 0;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameAllNegSpeedsGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        speedyGame.setMaxSpeed(-1);
        speedyGame.setTrafficGreenLight(false);

        int speed = 0;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsNegSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsNegSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderNegRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderNegGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = -6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 7;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 7);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 7;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorder2PosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-5);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorder2PosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(-4);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedNoMaxSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(0);
        speedyGame.setTrafficGreenLight(false);

        int speed = -1;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        speedyGame.setMaxSpeed(7);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(7);
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeNegSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeNegSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(3);
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedNegGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedNegRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(-3);
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameGreenRedNeg() {
        Game game = new Game(true);
        game.setTrafficGreenLight(false);
        int speed = -5;
        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameRedGreenSpeedNeg() {
        Game game = new Game(false);
        game.setTrafficGreenLight(true);

        int speed = -5;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameGreenGreenSpeedZero() {
        Game game = new Game(true);
        game.setTrafficGreenLight(true);

        int speed = 0;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameRedRedSpeedZero() {
        Game game = new Game(false);
        game.setTrafficGreenLight(false);

        int speed = 0;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameGreenRegSpeedPos() {
        Game game = new Game(true);
        game.setTrafficGreenLight(false);

        int speed = 5;
        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameRegGreenSpeedPos() {
        Game game = new Game(false);
        game.setTrafficGreenLight(true);

        int speed = 5;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void speedyGameGetMaxSpeedNegNeg() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(-1);

        int expected = 5;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameGetMaxSpeedNegPos() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(1);

        int expected = 1;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameGetMaxSpeedPosPos() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(1);

        int expected = 1;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameGetMaxSpeedPosNeg() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(-1);

        int expected = 5;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameGetMaxSpeedNegZero() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        speedyGame.setMaxSpeed(0);

        int expected = 0;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameGetMaxSpeedPosZero() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        speedyGame.setMaxSpeed(0);

        int expected = 0;
        int actual = speedyGame.getMaxSpeed();
        Assertions.assertEquals(expected, actual);
    }

}





