public class FastPlayer implements Movable {
    private int startSpeed;
    private int speedStep;

    public int getSpeed() {
        int buffer = Math.abs(startSpeed);
        this.startSpeed = Math.abs(startSpeed) + speedStep;
        return buffer;
    }

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = Math.abs(startSpeed);
        this.speedStep = speedStep;
    }

}

