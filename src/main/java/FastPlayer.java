public class FastPlayer implements Movable {
    private int startSpeed;
    private int speedStep;

    public int getSpeed() {
        int buffer = Math.abs(startSpeed);
        this.startSpeed = Math.abs(startSpeed) + Math.abs(speedStep);
        return buffer;
    }

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = Math.abs(startSpeed);
        this.speedStep = Math.abs(speedStep);
    }

}

