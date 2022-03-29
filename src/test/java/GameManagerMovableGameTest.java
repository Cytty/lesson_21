import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class GameManagerMovableGameTest {

    @ParameterizedTest
    @CsvFileSource(resources = { "testDataGMGame.csv" })
        public void gameManagerMovableGameGreenStop1(boolean trafficGreenLight, int speed, int startSpeed, int speedStep,  int rounds, int expected) {
        Game game = new Game(trafficGreenLight);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(speed);
        Movable p2 = new FastPlayer(startSpeed, speedStep);

        int actual = gameManager.loser(p1, p2, game, rounds);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource( resources = { "testDataGMSpeedyGame.csv" })
    public void gameManagerMovableSpeedyGame(boolean trafficGreenLight, int speed, int startSpeed, int speedStep, int rounds, int maxSpeed, int expected) {
        Game game = new SpeedyGame(trafficGreenLight, maxSpeed);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(speed);
        Movable p2 = new FastPlayer(startSpeed, speedStep);

        int actual = gameManager.loser(p1, p2, game, rounds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPGameAllWin() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(0);
        Movable p2 = new ConstantPlayer(0);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPGameAllLos() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(2);
        Movable p2 = new ConstantPlayer(4);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPGameAllLosP1Neg() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(-2);
        Movable p2 = new ConstantPlayer(4);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPGameAllLosP2Neg() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(2);
        Movable p2 = new ConstantPlayer(-4);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPGameP2Los() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(0);
        Movable p2 = new ConstantPlayer(1);

        int expected = 1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPGameP1Los() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(1);
        Movable p2 = new ConstantPlayer(0);

        int expected = -1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void gameManagerMovableTwoFPGameAllLos1r() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(1, 2);
        Movable p2 = new FastPlayer(3, 1);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPGame1PLos1r() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(1, 2);
        Movable p2 = new FastPlayer(0, 1);

        int expected = -1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPGame1PLosXr() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(0, 2);
        Movable p2 = new FastPlayer(0, 0);

        int expected = -1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPGame2PLos1r() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(0, 2);
        Movable p2 = new FastPlayer(1, 0);

        int expected = 1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPGame2PLosXr() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(0, 0);
        Movable p2 = new FastPlayer(0, 2);

        int expected = 1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPGameAllWin() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(0, 0);
        Movable p2 = new FastPlayer(0, 0);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPSpeedyGameAllLos() {
        Game game = new SpeedyGame(false, 2);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(4);
        Movable p2 = new ConstantPlayer(3);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPSpeedyGameAllWin() {
        Game game = new SpeedyGame(false, 2);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(2);
        Movable p2 = new ConstantPlayer(1);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPSpeedyGame1PLos() {
        Game game = new SpeedyGame(false, 2);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(-3);
        Movable p2 = new ConstantPlayer(1);

        int expected = -1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoCPSpeedyGame2PLos() {
        Game game = new SpeedyGame(false, 2);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(1);
        Movable p2 = new ConstantPlayer(4);

        int expected = 1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPSpeedyGameAllLos1r() {
        Game game = new SpeedyGame(false, 2);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(3, -1);
        Movable p2 = new FastPlayer(-4, -2);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPSpeedyGameAllLosXr() {
        Game game = new SpeedyGame(false, 3);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(1, -2);
        Movable p2 = new FastPlayer(2, 1);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void gameManagerMovableTwoFPSpeedyGame1PLos1r() {
        Game game = new SpeedyGame(false, 3);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(4, -2);
        Movable p2 = new FastPlayer(2, 1);

        int expected = -1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPSpeedyGame1PLosXr() {
        Game game = new SpeedyGame(false, 3);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(2, -2);
        Movable p2 = new FastPlayer(2, 1);

        int expected = -1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPSpeedyGame2PLos1r() {
        Game game = new SpeedyGame(false, 3);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(2, -2);
        Movable p2 = new FastPlayer(4, 1);

        int expected = 1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPSpeedyGame2PLosXr() {
        Game game = new SpeedyGame(false, 3);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(1, -1);
        Movable p2 = new FastPlayer(1, 2);

        int expected = 1;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameManagerMovableTwoFPSpeedyGameAllWin() {
        Game game = new SpeedyGame(false, 5);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(1, -1);
        Movable p2 = new FastPlayer(1, 2);

        int expected = 0;
        int actual = gameManager.loser(p1, p2, game, 3);

        Assertions.assertEquals(expected, actual);
    }

}
