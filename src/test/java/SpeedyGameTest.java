import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {

    @Test
    public void speedyGameAllNegSpeedsRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        System.out.println("1. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-1);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 0;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void speedyGameAllNegSpeedsGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        System.out.println("2. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-1);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 0;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void speedyGameSetNegMaxSpeedsNegSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("3. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void speedyGameSetNegMaxSpeedsNegSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("4. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("5. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("6. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderNegRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("7. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderNegGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("8. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-4);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("9. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorderPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("10. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("11. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 5;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSetNegMaxSpeedsIsSpeedPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("12. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 5;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorder2PosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("13. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-5);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedIsBorder2PosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("14. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-4);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameSpeedNoMaxSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("15. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(0);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -1;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        System.out.println("16. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(7);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        System.out.println("17. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(7);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 6;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeNegSpeedGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("18. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeNegSpeedRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("19. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -5;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedPosGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        System.out.println("20. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedPosRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        System.out.println("21. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = 4;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedNegGreen() {
        SpeedyGame speedyGame = new SpeedyGame(true, -5);
        System.out.println("22. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedyGameResultChangeAllSpeedNegRed() {
        SpeedyGame speedyGame = new SpeedyGame(false, -5);
        System.out.println("23. Прежняя максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setMaxSpeed(-3);
        System.out.println("Новая максимальная скорость " + speedyGame.getMaxSpeed());
        speedyGame.setTrafficGreenLight(false);

        int speed = -4;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameGreenRedNeg() {
        Game game = new Game(true);
        System.out.println("24. Прежний свет светофора " + game.getTrafficGreenLight());
        game.setTrafficGreenLight(false);
        System.out.println("Новый свет светофора " + game.getTrafficGreenLight());
        int speed = -5;
        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameRedGreenSpeedNeg() {
        Game game = new Game(false);
        System.out.println("25. Прежний свет светофора " + game.getTrafficGreenLight());
        game.setTrafficGreenLight(true);
        System.out.println("Новый свет светофора " + game.getTrafficGreenLight());

        int speed = -5;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameGreenGreenSpeedZero() {
        Game game = new Game(true);
        System.out.println("26. Прежний свет светофора " + game.getTrafficGreenLight());
        game.setTrafficGreenLight(true);
        System.out.println("Новый свет светофора " + game.getTrafficGreenLight());

        int speed = 0;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameRedRedSpeedZero() {
        Game game = new Game(false);
        System.out.println("27. Прежний свет светофора " + game.getTrafficGreenLight());
        game.setTrafficGreenLight(false);
        System.out.println("Новый свет светофора " + game.getTrafficGreenLight());

        int speed = 0;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameGreenRegSpeedPos() {
        Game game = new Game(true);
        System.out.println("28. Прежний свет светофора " + game.getTrafficGreenLight());
        game.setTrafficGreenLight(false);
        System.out.println("Новый свет светофора " + game.getTrafficGreenLight());

        int speed = 5;
        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameRegGreenSpeedPos() {
        Game game = new Game(false);
        System.out.println("29. Прежний свет светофора " + game.getTrafficGreenLight());
        game.setTrafficGreenLight(true);
        System.out.println("Новый свет светофора " + game.getTrafficGreenLight());

        int speed = 5;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

}





