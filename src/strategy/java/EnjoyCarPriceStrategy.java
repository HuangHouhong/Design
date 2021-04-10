package strategy.java;

public class EnjoyCarPriceStrategy implements IPriceStrategy {
    @Override
    public int calculatePrice(int distance) {
        return 5 * distance;
    }
}
