import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test
    public void gameManagerGameRed() {
        GameManager gameManager = new GameManager(new Game(false));
        int[] speeds = {3, -4, 7, 0, 5};
        int expected = 1;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerGameGreen() {
        GameManager gameManager = new GameManager(new Game(true));
        int[] speeds = {3, -4, 6, 0, -5};
        int expected = 5;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerSpeedyGameRed() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 5));
        int[] speeds = {3, -4, 6, 0, -5};
        int expected = 4;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerSpeedyGameGreen() {
        GameManager gameManager = new GameManager(new SpeedyGame(true, 5));
        int[] speeds = {3, -4, 6, 0, 5};
        int expected = 5;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerSpeedyGameMaxSpeedNegRed() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, -5));
        int[] speeds = {3, -4, -6, 0, -5};
        int expected = 4;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerSpeedyGameMaxSpeedNegGreen() {
        GameManager gameManager = new GameManager(new SpeedyGame(true, -5));
        int[] speeds = {3, -4, -6, 0, -5};
        int expected = 5;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerSpeedyGameOtherArrRed() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, -5));
        int[] speeds = {3, -4, -6, 0, -5, 0, 8, -7};
        int expected = 5;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerSpeedyGameOtherArrGreen() {
        GameManager gameManager = new GameManager(new SpeedyGame(true, -5));
        int[] speeds = {3, -4, -6, 0, -5, 0, 8, -7};
        int expected = 8;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }
}
