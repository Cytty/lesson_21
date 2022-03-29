public class GameManager {

    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int countRounds(int[] speeds) {
        return game.roundsGame(speeds);
    }

    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int countR1 = 0;
        int countR2 = 0;
        if (game.getTrafficGreenLight()) {
            return 0;
        } else {
            while (game.isFailed(p1.getSpeed()) && countR1 != rounds) {
                countR1++;
            }
            while (game.isFailed(p2.getSpeed()) && countR2 != rounds) {
                countR2++;
            }
            if (countR1 == countR2) {
                return 0;
            } else {
                if (countR1 < countR2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }
}
