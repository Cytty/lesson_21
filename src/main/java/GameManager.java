public class GameManager {

    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int countRounds(int[] speeds) {
        return game.roundsGame(speeds);
    }
}