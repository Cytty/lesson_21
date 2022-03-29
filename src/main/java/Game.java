public class Game {
    private boolean trafficGreenLight;

    public Game(boolean trafficGreenLight) {
        this.trafficGreenLight = trafficGreenLight;
    }

    public boolean getTrafficGreenLight() {
        return trafficGreenLight;
    }

    public boolean isFailed(int speed) {                            //определяет результат по одной скорости
        if (!trafficGreenLight && Math.abs(speed) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public int roundsGame(int[] speeds) {           //считает количество успешных раундов из массива скоростей
        int rounds = 0;
        if (trafficGreenLight) {
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

