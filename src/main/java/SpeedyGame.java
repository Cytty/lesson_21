public class SpeedyGame extends Game {
    private int maxSpeed;

    public SpeedyGame(boolean trafficGreenLight, int maxSpeed) {  //конструктор
        super(trafficGreenLight);
        this.maxSpeed = Math.abs(maxSpeed);
    }

    public void setMaxSpeed(int newMaxSpeed) {                        //сеттер
        if (newMaxSpeed < 0) {
            return;
        }
        maxSpeed = newMaxSpeed;
    }

    public int getMaxSpeed() {                                        //геттер
        return maxSpeed;
    }

    @Override
    public boolean isFailed(int speed) {                                         //метод
        if (getTrafficGreenLight() == false && Math.abs(speed) > maxSpeed) {
            return false;
        } else {
            return true;
        }
    }
}
