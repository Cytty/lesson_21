public class SpeedyGame extends Game {
    private int maxSpeed;

    public SpeedyGame(boolean trafficGreenLight, int maxSpeed) {
        super(trafficGreenLight);
        this.maxSpeed = Math.abs(maxSpeed);
    }

    @Override
    public boolean isFailed(int speed) {                                //определяет результат по одной скорости
        if (!getTrafficGreenLight() && Math.abs(speed) > maxSpeed) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int roundsGame(int[] speeds) {   //считает количество успешных раундов из массива скоростей
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

