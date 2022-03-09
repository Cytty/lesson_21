public class Game {
    private boolean trafficGreenLight;

    public Game(boolean trafficGreenLight) {
        this.trafficGreenLight = trafficGreenLight;
    }

    public boolean getTrafficGreenLight() {
        return trafficGreenLight;
    }

    public int roundsGame(int[] speeds) {
        int rounds = 0;
        if (trafficGreenLight == true) {
            rounds = speeds.length;
        } else {
            for (int speed : speeds) {
                if (speed == 0) {
                    rounds++;
                }
            }
        }
        return rounds;
    }


    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int i = 0;
        int x = 0;
        if (getTrafficGreenLight()) {
            x = 0;
        } else {
            if (Math.abs(p1.getSpeed()) == 0) {
                while (i != Math.abs(rounds)) {
                    if (Math.abs(p2.getSpeed()) == 0) {
                        i++;
                    } else {
                        x = 1;
                        break;
                    }
                }
            } else {
                if (Math.abs(p2.getSpeed()) != 0) {
                    x = 0;
                } else {
                    x = -1;
                }
            }

        }
        return x;
    }
}

