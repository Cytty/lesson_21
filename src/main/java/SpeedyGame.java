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
}
