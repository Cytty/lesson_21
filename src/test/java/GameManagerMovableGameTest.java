import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class GameManagerMovableGameTest {

    @ParameterizedTest
    @CsvFileSource(resources = { "testDataGMGame.csv" })
    public void gameManagerMovableGame(boolean trafficGreenLight, int speed, int startSpeed, int speedStep,  int rounds, int expected) {
        Game game = new Game(trafficGreenLight);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(speed);
        Movable p2 = new FastPlayer(startSpeed, speedStep);

        int actual = gameManager.loser (p1, p2, game, rounds);

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource( resources = { "testDataGMSpeedyGame.csv" })
    public void gameManagerMovableSpeedyGame(boolean trafficGreenLight, int speed, int startSpeed, int speedStep,  int rounds, int maxSpeed,  int expected) {
        Game game = new SpeedyGame(trafficGreenLight, maxSpeed);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new ConstantPlayer(speed);
        Movable p2 = new FastPlayer(startSpeed, speedStep);

        int actual = gameManager.loser(p1, p2, game, rounds);

        Assertions.assertEquals(expected, actual);
    }
}
