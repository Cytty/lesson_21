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
}
