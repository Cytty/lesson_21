public class SpeedyGame extends Game {
    private int maxSpeed;

    public SpeedyGame(boolean trafficGreenLight, int maxSpeed) {
        super(trafficGreenLight);
        this.maxSpeed = Math.abs(maxSpeed);
    }

    @Override
    public int roundsGame(int[] speeds) {
        int rounds = 0;
        if (getTrafficGreenLight()) {
            rounds = speeds.length;
        } else {
            for (int speed : speeds) {
                if (Math.abs(speed) <= Math.abs(maxSpeed)) {
                    rounds++;
                }
            }
        }
        return rounds;
    }

    @Override
    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int i = 0;
        int x = 0;
        if (getTrafficGreenLight()) {
            x = 0;
        } else {
            if (Math.abs(p1.getSpeed()) <= Math.abs(maxSpeed)) {
                while (i != Math.abs(rounds)) {
                    if (Math.abs(p2.getSpeed()) <= Math.abs(maxSpeed)) {
                        i++;
                    } else {
                        x = 1;
                        break;
                    }
                }
            } else {
                if (Math.abs(p2.getSpeed()) > Math.abs(maxSpeed)) {
                    x = 0;
                } else {
                    x = -1;
                }
            }

        }
        return x;
    }
}
