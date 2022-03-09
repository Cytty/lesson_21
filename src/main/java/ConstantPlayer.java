public class ConstantPlayer implements Movable {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public ConstantPlayer(int speed) {
        this.speed = speed;
    }
}
