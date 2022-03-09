public class GameManager {

    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int countRounds(int[] speeds) {
        return game.roundsGame(speeds);
    }

    public int whoLost(Movable p1, Movable p2, Game game, int rounds) {
        return game.loser(p1, p2, game, rounds);
    }
}