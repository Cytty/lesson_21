public class GameManager {

    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int countRounds(int[] speeds) {
        return game.roundsGame(speeds);
    }

    public int loser (Movable p1, Movable p2, Game game, int rounds) {
        int i = 0;
        int x = 0;
        if (game.getTrafficGreenLight()) {
            x = 0;
        } else {
            if (game.isFailed(p1.getSpeed())) {
                while (i != Math.abs(rounds)) {
                    if (game.isFailed(p2.getSpeed())) {
                        i++;
                    } else {
                        x = 1;
                        break;
                    }
                }
            } else {
                if (!game.isFailed(p2.getSpeed())) {
                    x = 0;
                } else {
                    x = -1;
                }
            }
        }
        return x;
    }
}