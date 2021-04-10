package strategy.java;

public class PriceCalculation {

    private IPriceStrategy mStrategy;

    public void setStrategy(IPriceStrategy strategy) {
        this.mStrategy = strategy;
    }

    public int calc(int distance) {
        if (mStrategy == null) {
            return -1;
        }
        return mStrategy.calculatePrice(distance);
    }
}
