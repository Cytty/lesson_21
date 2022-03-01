import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void greenRedNeg() {
        Game game = new Game(true);
        game.setTrafficGreenLight(false);
        int speed = -5;
        boolean actual = game.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void greenSpeedNeg() {
        Game game = new Game(false);
        game.setTrafficGreenLight(true);

        int speed = -5;
        boolean actual = game.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void greenGreenSpeedZero() {
        Game game = new Game(true);
        game.setTrafficGreenLight(true);

        int speed = 0;
        boolean actual = game.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void redRedSpeedZero() {
        Game game = new Game(false);
        game.setTrafficGreenLight(false);

        int speed = 0;
        boolean actual = game.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void greenRegSpeedPos() {
        Game game = new Game(true);
        game.setTrafficGreenLight(false);

        int speed = 5;
        boolean actual = game.isFailed(speed);
        Assertions.assertFalse(actual);
    }

    @Test
    public void regGreenSpeedPos() {
        Game game = new Game(false);
        game.setTrafficGreenLight(true);

        int speed = 5;
        boolean actual = game.isFailed(speed);
        Assertions.assertTrue(actual);
    }

}
