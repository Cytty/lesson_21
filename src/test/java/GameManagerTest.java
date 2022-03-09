import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test
    public void gameManagerRoundsGameGameRed() {
        GameManager gameManager = new GameManager(new Game(false));
        int[] speeds = {3, -4, 7, 0, 5, 0};
        int expected = 2;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerRoundsGameGameGreen() {
        GameManager gameManager = new GameManager(new Game(true));
        int[] speeds = {3, -4, 6, 0, -5, 0};
        int expected = 6;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerRoundsGameSpeedyGameRed() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 5));
        int[] speeds = {3, -4, 6, 0, -5};
        int expected = 4;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerRoundsGameSpeedyGameGreen() {
        GameManager gameManager = new GameManager(new SpeedyGame(true, 5));
        int[] speeds = {3, -4, 6, 0, 5};
        int expected = 5;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerRoundsGameSpeedyGameMaxSpeedNegRed() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, -5));
        int[] speeds = {3, -4, -6, 0, -5};
        int expected = 4;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerRoundsGameSpeedyGameMaxSpeedNegGreen() {
        GameManager gameManager = new GameManager(new SpeedyGame(true, -5));
        int[] speeds = {3, -4, -6, 0, -5};
        int expected = 5;
        int actual = gameManager.countRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerRoundsGameSpeedyGameOtherArrRed() {
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
