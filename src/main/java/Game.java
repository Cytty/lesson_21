public class Game {
    private boolean trafficGreenLight;


    public Game(boolean trafficGreenLight) {                 //конструктор
        this.trafficGreenLight = trafficGreenLight;
    }

    public boolean getTrafficGreenLight() {                            // геттер
        return trafficGreenLight;
    }

    public void setTrafficGreenLight(boolean newTrafficGreenLight) {            // сеттер
        trafficGreenLight = newTrafficGreenLight;
    }

    public boolean isFailed(int speed) {                            // метод
        if (trafficGreenLight == false && Math.abs(speed) != 0) {
            return false;
        } else {
            return true;
        }
    }
}

