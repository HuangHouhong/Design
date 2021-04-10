package strategy.java;

public class SpeedCarPriceStrategy implements IPriceStrategy {

    @Override
    public int calculatePrice(int distance) {
        return 3 * distance;
    }
}
